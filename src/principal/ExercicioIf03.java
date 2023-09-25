package principal;

import javax.swing.JOptionPane;

/**
 * 3 — Faça um programa para solicitar o nome e as duas notas de um aluno. 
 * Calcular sua média e informá-la. 
 * Se ela for inferior a 70, escrever “Reprovado”; caso contrário, escrever “Aprovado”
 */

public class ExercicioIf03 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua primeira nota:"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Segunda nota:"));
		int med = (n1+n2)/2;
		if(med<70) {
			JOptionPane.showMessageDialog(null, nome + " Reprovado");
		}else {
			JOptionPane.showMessageDialog(null, nome + " Aprovado");
		}
	}

}
