package br.com.newton.Veículo;

import javax.swing.*;

public class MainVeiculo {
        public static void main(String[] args) {

            String placaOnibus = JOptionPane.showInputDialog("Informe a placa do ônibus:");
            int anoOnibus = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do ônibus:"));
            int assentosOnibus = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de assentos:"));
            Onibus onibus = new Onibus(placaOnibus, anoOnibus, assentosOnibus);

            onibus.mostraDados();

            String placaCaminhao = JOptionPane.showInputDialog("Informe a placa do caminhão:");
            int anoCaminhao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do caminhão:"));
            int eixosCaminhao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eixos do caminhão:"));
            Caminhao caminhao = new Caminhao(placaCaminhao, anoCaminhao, eixosCaminhao);

            caminhao.mostraDados();
        }
}
