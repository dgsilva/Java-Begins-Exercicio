package principal;

import javax.swing.JOptionPane;

//2-Crie um programa para ler dois números e informar a média aritmética e metade da diferença entre eles.

// Shirt + CTRL + O -> Importar a Biblioteca

public class Exercicio02 {
	
	public static void main(String[] args) {
		int medAri, metDif = 0;

		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		medAri = (n1 + n2) / 2;
		metDif = (n1 - n2) / 2;
		JOptionPane.showMessageDialog(null, "A média aritmética: " + medAri);
		JOptionPane.showMessageDialog(null, "A metade da diferença: " + metDif);
	}

}
