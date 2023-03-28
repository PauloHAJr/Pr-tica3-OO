package br.com.newton.Veículo;

import javax.swing.*;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void mostraDados() {
        JOptionPane.showMessageDialog(null, "Placa: " + getPlaca() + "\nAno: " + getAno(), "Dados do Veículo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Eixos: " + eixos, "Dados do Caminhão", JOptionPane.INFORMATION_MESSAGE);
    }
}