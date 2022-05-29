package view;

import java.util.Scanner;

import controller.ContaNumerosController;

public class ContaNumerosMain {

	public static void main(String[] args) {

		
		Scanner ler =  new Scanner(System.in);
		ContaNumerosController opcont = new ContaNumerosController();
		int n1 = 1, n2 = -1;
		
		while (n1 <10 || n1 >999999) {
		System.out.printf("digite o primeiro numero (de 10 a 999999)");
		n1 = ler.nextInt();
		}
		while (n2 <0 || n2 >9) {
		System.out.printf("digite o segundo numero (de 0 a 9)");
		n2 = ler.nextInt();
		}
		int resultado = opcont.contaNumeros(n1,n2);
		ler.close();
		System.out.println("o numero de vezes que o numero " +n2+" aparece é "+resultado+" vezes.");
	}

}
