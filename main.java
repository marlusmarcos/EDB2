

public class Main {
	public static void main (String [] args) {
		Arvore a1 = new Arvore ();
		//Main cc = new Main ();
		
		a1.inserir(30);
		a1.inserir(15);
		a1.inserir(80);
		a1.inserir(10);
		a1.inserir(25);
		a1.inserir(40);
		a1.inserir(85);
		//a1.inserir(40);
		/**
		a1.inserir(35);
		a1.inserir(50);
		a1.inserir(90);
		a1.inserir(45);
		a1.inserir(70);
		a1.inserir(60);
		a1.inserir(75);
		a1.inserir(55);
		a1.inserir(65);
		*/
		System.out.print ("Listando os elementos em ordem: ");
		a1.printEmOrdem(a1.getRaiz());
		//System.out.print ("\nListando elemento na posição 3: ");
		System.out.println ("\né cheia? " + a1.ehCheia());
		System.out.println("número de nós: " +a1.getNnos());
		System.out.println(a1.getexp());
		System.out.println (a1.toString());
		
		
		
		
		
		
		
		//System.out.println (a1.nEsimo(1));
		//System.out.println(a1.posicao(9));
		//a1.listar();
		//System.out.println(a1.nEsimo(4));
		
		
		//System.out.println("\nPrintando elementos ");
	
		
			
			
		
	}
	
}
