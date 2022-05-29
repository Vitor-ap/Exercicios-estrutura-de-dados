package controller;

public class ContaNumeroController {

	public ContaNumeroController() {
		super();
	}

	public int calcula(int todos, int verificador) {
			
		if (todos <=0) {
			return 0;
		}
		else {
			int result = todos/10;
			int cont = 0;
			if (todos  % 10 == verificador) {
				cont = 1;
			}
			
				return cont + calcula(result,verificador);
		}
			
	}
		
}
	
