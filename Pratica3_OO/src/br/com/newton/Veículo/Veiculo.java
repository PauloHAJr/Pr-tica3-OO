package br.com.newton.Veículo;

import javax.swing.*;

public class Veiculo {
    private String placa = "";
    private int ano = 0;

    public void mostraDados() {
        String dados = "Placa: " + this.placa + "\n" + "Ano: " + this.ano;
        JOptionPane.showMessageDialog(null, dados, "Dados do Veículo:", JOptionPane.INFORMATION_MESSAGE);
    }

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        super();
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
