package controller;


public class NaturaisController {

	public NaturaisController() {
		super();
	}
	
	
	public int somaNaturais(int n) {
	if (n <= 0) {
		return 0;
	}
		else {
	
	 return n + somaNaturais(n-1);
	
		}
	}
}