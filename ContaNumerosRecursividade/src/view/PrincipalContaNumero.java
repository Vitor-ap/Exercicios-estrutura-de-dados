package view;

import javax.swing.JOptionPane;

import controller.ContaNumeroController;

public class PrincipalContaNumero {

	public static void main(String[] args) {
		ContaNumeroController cont = new ContaNumeroController();
		int n1, n2;
		n1 = 1;
		n2 = -1;
		while (n1 <10 || n1 >999999) {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um valor entre 10 e 999999"));
		}
		while (n2 <0 || n2 >9) {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um valor entre 0 e 9"));
		}
		int result = cont.calcula(n1, n2);
		
		JOptionPane.showMessageDialog(null, "quantidade de vezes que aparece o " +n2+" é: "+result);

	}

}
