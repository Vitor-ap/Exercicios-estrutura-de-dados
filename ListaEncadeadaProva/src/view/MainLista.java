package view;

	

	public class MainLista {
		
		import java.util.LinkedList;
		import java.util.List;
	
    public static void main(String[] args) {
        List<String> primeiraLista = new LinkedList<String>();
        List<String> segundaLista = new LinkedList<String>();

    
        primeiraLista.add("V");
        primeiraLista.add("I");
        primeiraLista.add("T");
        primeiraLista.add("O");
        primeiraLista.add("R");

        segundaLista.add("A");
        segundaLista.add("L");
        segundaLista.add("V");
        segundaLista.add("E");
        segundaLista.add("S");

        System.out.println(Concat(primeiraLista, segundaLista).toString());
    }

    public static List<String> Concat(List<String> primeiraLista, List<String> segundaLista) {
        List<String> listaConcatenada = new LinkedList<String>();

        for (int i = 0; i <= primeiraLista.size(); i++) {
            if (segundaLista.size() - (i + 1) < 0) break;

            listaConcatenada.add(primeiraLista.get(i));
            listaConcatenada.add(segundaLista.get(segundaLista.size() - (i + 1)));
        }

        return listaConcatenada;
    }

}