package view;


import javax.swing.JOptionPane;

import com.br.VitorAPLib.string.Pilha;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController palindromoController = new PalindromoController();
		Pilha pilha = new Pilha();
		String mensagem;
		String palavra = "a";
		String palavraInvertida;
		while (palavra != null ) { 
			palavra = JOptionPane.showInputDialog(null, "Digite uma palavra para verificar se � um pal�ndromo. Ou clique em 'cancel' para sair");
			if (palavra == null) {
				JOptionPane.showMessageDialog(null,"Programa Encerrado");
				break;
			}
			palavraInvertida = palindromoController.invertePalavra(palavra, pilha);
		
			if (palindromoController.palindromo(palavra, palavraInvertida)) {
			mensagem = "Sim!! � um palindromo. Boa Sacada!";
			} else {
			mensagem = "N�o � um pal�ndromo";
			}
		
			JOptionPane.showMessageDialog(null, mensagem);
		}
	
	}
}