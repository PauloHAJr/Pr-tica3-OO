package br.com.newton.Carnaval;

import javax.swing.*;

public class Normal extends Ingresso{

    public Normal(double valor) {
        super(valor);
    }

    public void mostraValor(){
        JOptionPane.showMessageDialog(null,"Ingresso normal: "+getValor());
    }
}
