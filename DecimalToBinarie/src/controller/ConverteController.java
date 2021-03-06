package controller;

import com.br.VitorAPLib.integer.Pilha;

public class ConverteController {
	
	public ConverteController() {
	}
	
	public String decToBin(int decimal) {
		int quociente = decimal;
		int resto = 0;
		String binario = "";
		
		Pilha pilha = new Pilha();
		
		while (quociente > 0) {
			resto = quociente % 2;
			quociente = quociente / 2;
			
			pilha.push(resto);
		}
		
		while (!pilha.isEmpty()) {
			try {
				binario += pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return binario;
	}
	
}