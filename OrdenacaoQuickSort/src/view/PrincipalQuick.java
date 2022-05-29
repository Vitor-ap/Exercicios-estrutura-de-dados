package view;

import java.util.Scanner;

import controller.QuickController;

public class PrincipalQuick {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = 3;
		while (n !=1 && n!= 2 && n != 0) {
		System.out.printf("Digite 1 para simular a ordenacao Quick Sort do vetor 1 (15,18,29,1,0,4,13,18,25,15,43,0) ou 2 para simular o vetor 2 (100,99,98,97,96,95)  e 0 para encerrar");
		n = ler.nextInt();
		}
		
		ler.close();
		
		switch(n) {
		
		case 1:
		int[] vetor1 = {15,18,29,1,0,4,13,18,25,15,43,0};
		QuickController oCont = new QuickController();
		vetor1 = oCont.quickSort(vetor1, 0, vetor1.length - 1);

		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor1) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");
		
		break;
		
		
		case 2:
		int[] vetor2 = {100,99,98,97,96,95};
		QuickController oCont2 = new QuickController();
		vetor2 = oCont2.quickSort(vetor2, 0, vetor2.length - 1);

		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor2) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");
		break;
		
		case 0:
			System.out.println("Finalizou a aplicação");
			break;
		}

	}
}