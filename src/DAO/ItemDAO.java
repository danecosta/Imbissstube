package DAO;

import Factory.Conexao;
import java.sql.Connection;
import Entidades.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dane
 */
public class ItemDAO {

    public void inserir(Item item) throws Exception {
        if (item != null) {
            try {
                Connection conexao = Conexao.getConnection();
                Statement operacao = conexao.createStatement();

                operacao.executeUpdate("INSERT INTO item(descricaoItem, quantidadeItem, refNumMesa) VALUES('"
                        + item.getDescricaoItem()
                        + "',"
                        + item.getQuantidadeItem()
                        + ","
                        + item.getRefNumMesa()
                        + ")", new String[]{"idItem"});

                ResultSet resultado = operacao.getGeneratedKeys();

                if (resultado.next()) {
                    item.setIdItem(resultado.getInt(1));
                }

            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }

    public void atualizar(Item item) throws Exception {
        if (item != null) {
            try {
                Connection conexao = Conexao.getConnection();
                Statement operacao = conexao.createStatement();

                operacao.executeUpdate(
                        "UPDATE item SET descricaoItem='"
                        + item.getDescricaoItem() + "', quantidadeItem="
                        + item.getQuantidadeItem() + "', refNumMesa="
                        + item.getRefNumMesa()
                        + " WHERE idItem=" + item.getIdItem());

            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }

    public void remover(Item item) throws Exception {
        if (item != null) {
            try {
                Connection conexao = Conexao.getConnection();
                Statement operacao = conexao.createStatement();
                operacao.executeUpdate("DELETE FROM item WHERE idItem = " + item.getIdItem());

            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }

    public List<Item> buscarTodos() throws Exception {
        try {
            Connection conexao = Conexao.getConnection();
            List<Item> itens = new ArrayList<>();
            Statement operacao = conexao.createStatement();
            ResultSet resultado = operacao.executeQuery("SELECT * FROM item");

            while (resultado.next()) {
                Item item = new Item();
                item.setIdItem(resultado.getInt("idItem"));
                item.setDescricaoItem(resultado.getString("descricaoItem"));
                item.setQuantidadeItem(resultado.getInt("quantidadeItem"));
                item.setRefNumMesa(resultado.getInt("refNumMesa"));
                itens.add(item);
            }
            return itens;
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
    }

    public Item buscarItemPorID(int id) throws Exception {
        try {
            Connection conexao = Conexao.getConnection();
            Statement operacao = conexao.createStatement();
            ResultSet resultado = operacao.executeQuery("SELECT * FROM item WHERE idItem=" + id);

            if (resultado.next()) {
                Item item = new Item();
                item.setIdItem(resultado.getInt("idItem"));
                item.setDescricaoItem(resultado.getString("descricaoItem"));
                item.setQuantidadeItem(resultado.getInt("quantidadeItem"));
                item.setRefNumMesa(resultado.getInt("refNumMesa"));
                return item;
            }
            return null;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<Item> buscarItensPorMesa(int numMesa) throws Exception {
        try {
            Connection conexao = Conexao.getConnection();
            Statement operacao = conexao.createStatement();
            List<Item> itens = new ArrayList<>();
            ResultSet resultado = operacao.executeQuery("SELECT * FROM item WHERE refNumMesa=" + numMesa);

            if (resultado.next()) {
                Item item = new Item();
                item.setIdItem(resultado.getInt("idItem"));
                item.setDescricaoItem(resultado.getString("descricaoItem"));
                item.setQuantidadeItem(resultado.getInt("quantidadeItem"));
                item.setRefNumMesa(resultado.getInt("refNumMesa"));
                itens.add(item);
            }
            return itens;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
