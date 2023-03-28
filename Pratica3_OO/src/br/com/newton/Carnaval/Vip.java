package br.com.newton.Carnaval;

import javax.swing.*;

public class Vip extends Ingresso{

    private double valorAdicional;

    public Vip(double valor, double adicional) {
        super(valor);
    }

    public void mostraValor() {
        double valorTotal = getValor() + this.valorAdicional;
        JOptionPane.showMessageDialog(null, "Ingresso VIP: R$" + valorTotal);
    }
}
