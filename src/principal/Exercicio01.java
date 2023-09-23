package principal;

import javax.swing.JOptionPane;

//Shift + CTRL + C -> Fazendo um comentario

//1-Faça um programa para solicitar um número, calcular e informar o seu dobro.

public class Exercicio01 {

	// main CTRL + Espaço
	public static void main(String[] args) {
		
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
		int dobro = (numero * 2);
		JOptionPane.showMessageDialog(null, "O dobro foi: " + dobro);
		
	}
}
