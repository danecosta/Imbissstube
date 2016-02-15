package Entidades;

import java.io.Serializable;

/**
 *
 * @author Dane
 */
public class Item implements Serializable{

    private int idItem;
    private int quantidadeItem;
    private String descricaoItem;

    private int refNumMesa;

    public Item() {
    }

    public Item(int quantidade, String item, int refNumMesa) {
        this.quantidadeItem = quantidade;
        this.descricaoItem = item;
        this.refNumMesa = refNumMesa;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public long getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getRefNumMesa() {
        return refNumMesa;
    }

    public void setRefNumMesa(int refNumMesa) {
        this.refNumMesa = refNumMesa;
    }

    @Override
    public String toString() {
        return descricaoItem + " _______________________ " + quantidadeItem;
    }

}
