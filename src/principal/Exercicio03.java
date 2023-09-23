package principal;

import javax.swing.JOptionPane;

/*3-Faça o algoritmo de um programa para solicitar o nome e o salário de um empregado. Calcular e descontar 8% do seu salário.
Informar o valor do desconto e o salário liquido a receber */

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do empregado");
		Double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario"));
		double desc = (sal * 0.08);
		double salLiquido = (sal - desc);
		JOptionPane.showMessageDialog(null, "Informar o desconto: " + desc);
		JOptionPane.showMessageDialog(null,"Nome: " + nome +"\nSalario liquido a receber: " + salLiquido);
		
		
	}
}
