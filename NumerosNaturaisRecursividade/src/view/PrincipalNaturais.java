package view;

import javax.swing.JOptionPane;

import controller.NaturaisController;

public class PrincipalNaturais {

	public static void main(String[] args) {
		NaturaisController soma = new NaturaisController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros para somar"));
		int resultado = soma.somaNaturais(n);
JOptionPane.showMessageDialog(null, "o valor da soma é: " + resultado);
	}

}
