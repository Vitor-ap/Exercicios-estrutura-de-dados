package view;

import javax.swing.JOptionPane;

import controller.StringController;

public class Main {

	public static void main(String[] args) {
		StringController invertida = new StringController();
		String string = JOptionPane.showInputDialog(null,"Insira um texto");
		String resultado = invertida.invercao(string, string.length());
		JOptionPane.showMessageDialog(null, "o Texto invertido é: "+resultado);
	}

}

