package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController controller = new ConverteController();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor decimal para que seja convertido em bin�rio"));
		String convertido = controller.decToBin(decimal);
		JOptionPane.showMessageDialog(null,"Este valor em bin�rio �: "+convertido);
	}

}