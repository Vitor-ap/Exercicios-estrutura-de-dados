package controller;

public class FatorialController {

	public FatorialController(){
		super();
		
	}
	
	public int fatorial(int entrada) {
		if (entrada == 1) {
			return 1;
		}
		else {
			return entrada * fatorial(entrada-1);
		}
			
	}
}

/*
condicao de parada = quando entrada é igual a 1
o numero é multiplicado pela propira funcao (decrementada de 1), conforme exemplo abaixo:
entrada = 5
fat = 5 *(5-1) = 20
fat = 20 * (4-1) = 60
fat = 60 * (3-1) = 120
fat = 120 *(2-1) = 120...daqui em diante o termo fica 1 e a função é interrompida (ponto de parada)
*/
