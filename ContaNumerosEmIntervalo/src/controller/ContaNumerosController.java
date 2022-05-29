package controller;

public class ContaNumerosController {

	public ContaNumerosController() {
		super();
		
	}
		public int contaNumeros(int n1, int n2){
			int contador = 0;
			if (n1 <= 0 ) {
				return 0;
			}
			else {
				int resto = n1%10;
			if (resto == n2) {
				contador = 1;
				}
			return contador + contaNumeros(n1/10, n2);
			
			}
			
			
		}
	}

