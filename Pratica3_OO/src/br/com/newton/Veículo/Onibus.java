package br.com.newton.Veículo;

import javax.swing.*;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }
    public void mostraDados() {
        super.mostraDados();
        JOptionPane.showMessageDialog(null, "Assentos: " + assentos, "Dados do Ônibus", JOptionPane.INFORMATION_MESSAGE);
    }
}
