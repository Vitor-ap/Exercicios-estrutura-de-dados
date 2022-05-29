package controller;

import model.ListaEncadeada;
import model.No;

public class ListaController {
	
	public ListaController() {
		super();
	}
	
	public ListaEncadeada concat(ListaEncadeada lista1, ListaEncadeada lista2) {
		ListaEncadeada concatLista = new ListaEncadeada();
		int tam = lista1.getTamanho();
		
		for (int i = 1; i < tam; i++) {
			concatLista.adicionaElemento(new No(lista1.pegaElemento(i)));
			concatLista.adicionaElemento(new No(lista2.pegaElemento(i)));
		}
		
		return concatLista;
	}
	
	public ListaEncadeada clone(ListaEncadeada lista) { 
		ListaEncadeada cloneLista = new ListaEncadeada();
		int tam = lista.getTamanho();
		
		for (int i = 1; i == tam; i++) {
			cloneLista.adicionaElemento(new No(lista.pegaElemento(i)));
		}
		
		return cloneLista;
	}
	
	public void ascSort(ListaEncadeada lista) {
		int tam = lista.getTamanho();
		
		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; i++) {
				if (lista.pegaElemento(i) > lista.pegaElemento(j)) {
					int aux = lista.pegaElemento(j);
					lista.adicionaPosicao(j, new No(lista.pegaElemento(i)));
					lista.adicionaPosicao(i, new No(lista.pegaElemento(aux)));
				}
			}
		}
	}
	
	public void descSort(ListaEncadeada lista) {
		int tam = lista.getTamanho();
		
		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; i++) {
				if (lista.pegaElemento(i) < lista.pegaElemento(j)) {
					int aux = lista.pegaElemento(j);
					lista.adicionaPosicao(j, new No(lista.pegaElemento(i)));
					lista.adicionaPosicao(i, new No(lista.pegaElemento(aux)));
				}
			}
		}
	}
}
	

