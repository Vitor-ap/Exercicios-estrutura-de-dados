package view;

import controller.ListaController;
import model.ListaEncadeada;
import model.No;

public class Principal {

	public static void main(String[] args) {
		ListaController controller = new ListaController();
		
		ListaEncadeada lista1 = new ListaEncadeada();
		ListaEncadeada lista2 = new ListaEncadeada();
		
		for (int i = 0; i < 5; i++) {
			int num1 = (int) ((Math.random() * 200) + 1);
			lista1.adicionaElemento (new No(num1));
			
			int num2 = (int) ((Math.random() * 200) + 1);
			lista2.adicionaElemento(new No (num2));
		}

		/* System.out.println(lista1.toString()); */
		System.out.println(lista2.toString());
		
		//controller.concat(lista1, lista2);
		
		controller.ascSort(lista2);
	}

}