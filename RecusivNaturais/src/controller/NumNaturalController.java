package controller;

public class NumNaturalController {

	public NumNaturalController() {
		super();
		
	}

	public int somaNatural(int n) {
		if (n <= 0) {
			return 0;
		}
		else {
			return n + somaNatural(n-1);
		}
	}
	
	
	
}
