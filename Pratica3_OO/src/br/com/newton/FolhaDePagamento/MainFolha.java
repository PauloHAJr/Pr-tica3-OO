package br.com.newton.FolhaDePagamento;

import javax.swing.*;

public class MainFolha {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome do funcionário:");
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo:"));
        int tipoProvento = Integer.parseInt(JOptionPane.showInputDialog("Tipo de provento (1=salário fixo, 2=comissão, 3=produtividade):"));

        Funcionario funcionario = new Funcionario(nome, null,salarioFixo);

        switch (tipoProvento) {
            case 2:
                double comissao = Double.parseDouble(JOptionPane.showInputDialog("Comissão:"));
                funcionario.setComissao(comissao);
                break;
            case 3:
                double valorUnidade = Double.parseDouble(JOptionPane.showInputDialog("Valor por unidade produzida:"));
                int qtdUnidades = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de unidades produzidas:"));
                break;
        }

        String mensagem = "Proventos do funcionário " + funcionario.getNome() + ": R$" + funcionario.calcularProventos();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
