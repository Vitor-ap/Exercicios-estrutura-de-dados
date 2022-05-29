package controller;

public class StringController {
	
	public StringController() {
		super();
	}

	public String invercao(String string, int index) {
		if (index ==0) {
			return "";
		}
		else {
			return string.substring(index - 1, index) + invercao(string, index - 1);
		}
	}
}

/*
O ponto de parada é quando chega a 0
A substring ira pegar a penultima posicao e a ultima posicao após uma iteracao e inverte-las, empilhando e 
decrementando 1, até que chegue no ponto de parada (posicao 0), onde concatena o valor nulo e finalizará a operação.
*/
