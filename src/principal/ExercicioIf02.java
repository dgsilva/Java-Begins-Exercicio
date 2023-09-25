package principal;

import javax.swing.JOptionPane;

/**
 * 2 — Crie um programa para solicitar o ano atual e o ano de nascimento de uma
 * pessoa. Calcular sua idade e informá-la. Se sua idade for inferior a 16 anos,
 * escrever a mensagem “Não pode votar.” caso contrário, emitir a mensagem “É
 * eleitor”.
 */

public class ExercicioIf02 {

	public static void main(String[] args) {
		Integer anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
		Integer anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
		int idade = (anoAtual - anoNasc);
		if(idade<16) {
			JOptionPane.showMessageDialog(null, "Não pode votar." + " A sua idade é " + idade + " anos");
		}else {
			JOptionPane.showMessageDialog(null, "É eleitor." + " A sua idade é " + idade + " anos");
		}
	}			

}
