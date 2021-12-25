/**
 * Programa: Caixa.
 * Autor: Marcos Gabriel De Oliveira Favaretto.
 * Data: 13 de Agosto de 2019.
 */
package Caixa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Caixa {

    public static void main(String[] args) {
        String nomeProduto;
        int quantidadeProduto;
        float valorUnitarioProduto, descontoDaVenda, valorTotalDaCompra;
        DecimalFormat mascaraTexto = new DecimalFormat("R$ #,##0.00");

        nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto abaixo: ");
        quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto abaixo: "));
        valorUnitarioProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário do produto abaixo: ").replace(",", "."));
        descontoDaVenda = Float.parseFloat(JOptionPane.showInputDialog("Insira o desconto em % abaixo: ").replace("%", ""));
        valorTotalDaCompra = quantidadeProduto * valorUnitarioProduto - (quantidadeProduto * valorUnitarioProduto * (descontoDaVenda / 100));

        JOptionPane.showMessageDialog(null,
                "Produto: " + nomeProduto + "\n"
                + "Quantidade: " + String.valueOf(quantidadeProduto) + "\n"
                + "Valor unitário: " + mascaraTexto.format(valorUnitarioProduto) + "\n"
                + "Desconto: " + String.valueOf(descontoDaVenda) + "% \n"
                + "VALOR TOTAL DA COMPRA: " + mascaraTexto.format(valorTotalDaCompra));
        System.exit(0);
    }
}
