package principal;

import javax.swing.JOptionPane;

/**
  Faça um programa para solicitar o nome e a idade de uma pessoa. 
  Se sua idade for menor que 18 anos, escrever a mensagem: “É menor”.
 */
public class ExercicoIf01 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
		//Estrutura condicional Simples.
		if(idade<18) {
			JOptionPane.showMessageDialog(null, nome +  " você tem " + idade + " anos então você é menor.");
		}
		
	}

}
