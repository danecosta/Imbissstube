package Entidades;

import javax.swing.JList;

/**
 *
 * @author Dane
 */
public class Mesa{

    private int numero;
    private JList<Item> lstMesa;
    private String horaAbertura;
    private String horaFechamento;

    public Mesa() {
    }

    public Mesa(int numero, JList<Item> lstMesa, String horaAbertura, String horaFechamento) {
        this.numero = numero;
        this.lstMesa = lstMesa;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public JList<Item> getLstMesa() {
        return lstMesa;
    }

    public void setLstMesa(JList<Item> lstMesa) {
        this.lstMesa = lstMesa;
    }

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

}
