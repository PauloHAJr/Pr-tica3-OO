package br.com.newton.Carnaval;

import javax.swing.*;

public class Camarote extends Ingresso{
    private double adicional;
    private String localizacao;

    public Camarote(double valor, double adicional, String localizacao) {
        super(valor);
        this.adicional = adicional;
        this.localizacao = localizacao;
    }

    public void imprimeValor() {
        double valorTotal = getValor() + adicional;
        String mensagem = "Ingresso Camarote: R$" + valorTotal + "\nLocalização: " + localizacao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public static void main(String[] args) {

        String[] opcoes = {"Ingresso Normal", "Ingresso VIP", "Ingresso Camarote"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de ingresso:", "Ingressos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                Normal ingressoNormal = new Normal(50.0);
                ingressoNormal.mostraValor();
                break;
            case 1:
                Vip ingressoVIP = new Vip(100.0, 50.0);
                ingressoVIP.mostraValor();
                break;
            case 2:
                String localizacao = JOptionPane.showInputDialog("Informe a localização do camarote:");

                double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do ingresso:"));

                double adicional = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor adicional do camarote:"));

                Camarote ingressoCamarote = new Camarote(valor, adicional, localizacao);
                ingressoCamarote.imprimeValor();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }}