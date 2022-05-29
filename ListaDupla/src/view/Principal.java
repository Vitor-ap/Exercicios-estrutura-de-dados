package view;

import java.util.LinkedList;
import java.util.List;

import controller.DuplaEncadeadaController;

public class Principal {

	public static void main(String[] args) {
		DuplaEncadeadaController controller = new DuplaEncadeadaController();
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		for (int i = 0; i < 6; i++) {
			System.out.println("=====================");
			int num1 = (int) ((Math.random() * 200) + 1);
			list1.add(num1);
			System.out.println(num1);
			int num2 = (int) ((Math.random() * 200) + 1);
			list2.add(num2);
			System.out.println(num2);
		}
		System.out.println("=====================\n");	
		controller.concat(list1, list2);
		
		System.out.println("Primeira Lista ===> "+list1+"\n");
		System.out.println("Segunda Lista  ===> "+list2+"\n\n");
		System.out.println(" | Primeira Lista dividida em 2 |");
		System.out.println(" v                              v\n");
		controller.split( list1, 3);
		
	}

}