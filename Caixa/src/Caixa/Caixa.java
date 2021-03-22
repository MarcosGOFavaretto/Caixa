/**
 * Programa: Caixa
 * Autor: Marcos Gabriel De Oliveira Favaretto
 * Data: 13 de Agosto de 2019
 */
package Caixa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Caixa {

    public static void main(String[] args) {
        String nomeDoProduto = "";
        int quantidadeDoProduto = 0;
        float valorUnitárioDoProduto = 0;
        float descontoDaVenda = 0;
        float valorTotalDaCompra = 0;
        nomeDoProduto = JOptionPane.showInputDialog("Digite o nome do produto abaixo: ");
        quantidadeDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto abaixo: "));
        valorUnitárioDoProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário do produto abaixo: ").replace(",", "."));
        descontoDaVenda = Float.parseFloat(JOptionPane.showInputDialog("Insira o desconto em % abaixo: ").replace("%", ""));
        valorTotalDaCompra = quantidadeDoProduto * valorUnitárioDoProduto - (quantidadeDoProduto * valorUnitárioDoProduto * (descontoDaVenda / 100));
        DecimalFormat mascaraDoTexto = new DecimalFormat("R$ #,##0.00");
        JOptionPane.showMessageDialog(null, "Produto: " + nomeDoProduto + "\n" + "Quantidade: " + String.valueOf(quantidadeDoProduto) + "\n" + "Valor unitário: " + mascaraDoTexto.format(valorUnitárioDoProduto) + "\n" + "Desconto: "+String.valueOf(descontoDaVenda) +"% \n"+"VALOR TOTAL DA COMPRA: "+mascaraDoTexto.format(valorTotalDaCompra));
        System.exit(0);
    }
}
