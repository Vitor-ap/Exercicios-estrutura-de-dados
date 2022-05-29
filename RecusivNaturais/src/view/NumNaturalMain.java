package view;

import java.util.Scanner;

import controller.NumNaturalController;

public class NumNaturalMain {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	NumNaturalController opcont = new NumNaturalController();
	int n;
	System.out.printf("Digite um valor inteiro");
	n = ler.nextInt();
	ler.close();
	int resultado = opcont.somaNatural(n);
	System.out.println("Valor da Soma é" + resultado);
	
	
	}

}
