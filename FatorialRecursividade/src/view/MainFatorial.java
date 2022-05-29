package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class MainFatorial {

	public static void main(String[] args) {
		int entrada;
		FatorialController fat = new FatorialController();

		do {
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro entre 1 e 12"));
		}
		while (entrada <=0 || entrada >12);
	
		int resultado = fat.fatorial(entrada);
JOptionPane.showMessageDialog(null, "O fatorial é: "+resultado);
}
}
