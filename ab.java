import java.lang.Math;
import java.util.Queue;
import java.util.LinkedList; 

public class Arvore {
	private No raiz;
	private int n_nos;
	private int exp;
	
	public No getRaiz () {
		return raiz;
	}
	public int getNnos() {
		return n_nos;
	}
	public int getexp () {
		return exp;
	}
	
	
	//=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
	/**
	 * 
	 * @param valor represente o número no qual será inserido 
	 */
	public void inserir (int valor) {
		
		insere (raiz, valor);
		
	}
	
	/**
	 * Função printa os elementos "EMORDEM";
	 * @param no
	 */
	public void printEmOrdem(No no) {
	    if (no != null) {
	        printEmOrdem(no.getEsq());
	        System.out.print(no.getValor() + " ");
	        printEmOrdem(no.getDir());
	    }
	}
	
	/**
	 * 
	 * @param no No passado como parametro um No criado caso a árvore seja nula;
	 * @param valor, Valor do elemento que é passado para ser inserido;
	 */

	public void insere (No no, int valor) {
		
		if (no == null) {
			raiz = new No (valor);
			n_nos +=1;
			} else {
				if (no.valor > valor) {
					if (no.esq == null) {
						no.esq = new No (valor);
						n_nos +=1;
					} else {
						insere (no.esq, valor);
					}
				}
				if (no.valor < valor) {
					if ( no.dir == null) {
						no.dir = new No (valor);
						n_nos +=1;
					} else {
						insere (no.dir, valor);
					} // fim do else a cima
				
				} // fim do if dir
		}
	} // fim do método inserir
	
	

	public int maxAltura(No atual) {
	     if(atual == null || (atual.esq == null && atual.dir == null))
	       return 0;
	     else {
	   	if (maxAltura(atual.esq) > maxAltura(atual.dir))
	   	   return ( 1 + maxAltura(atual.esq) );
	   	else
		   return ( 1 + maxAltura(atual.dir) );
	     }
	  }
	
// ==*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
	public boolean ehCheia () {
		exp = maxAltura(this.raiz)+1;
		return Math.pow(2,exp)-1 == n_nos;
	}
	
	public boolean ehCompleta () {
		int ar_altura = maxAltura(raiz);
		if (Math.pow(2, ar_altura)-1 == n_nos) return true;
		
		if(raiz == null || (raiz.esq == null && raiz.dir == null))
		       return false;
		
		return false;
	}

	
	public String toString () {
		String str = "";
		Queue<No> fila = new LinkedList<No>();
		
		if (raiz == null) {
			return str;
		}
		
		fila.add(raiz);
		
		while (!fila.isEmpty()) {
			No aux = fila.peek();
			fila.remove();
			str += aux.getValor() + " ";
			if (aux.esq != null) {
				fila.add(aux.esq);
			}
			if (aux.dir != null) {
				fila.add(aux.dir);
			}
			
		}

		return str;
	}
	

	public int enesimoElemento (int i) {
		No no = new No();
		
	}
	
	public int nEsimo(int i,No no) {
	    if (no != null) {
	        printEmOrdem(no.getEsq());
	        System.out.print(no.getValor() + " ");
	        printEmOrdem(no.getDir());
	    }
	}
	
	
	/**
	 * NÃO ACEITA
	 * @param k Elemento no qual queremos saber sua posição
	 * @return retonar a posição simétrica do elemento K
	 
	public int posicao(int k) {
		for (int i = 0; i < emordem.size(); i++) {
			if (emordem.get(i) == k) {
				return i+1;
			}
		}
		return -1; //case error
	}
	*/
	/**public void listar () {
		
		for (int i = 0; i < emordem.size(); i++) {
			System.out.print (emordem.get(i)+ " ");
				
			}
	}
	/** NÃO ACEITA
	 * 
	public int nEsimo (int p) {
		p = p-1;
		for (int i = 0; i < emordem.size(); i++) {
			if (i == p) {
				return emordem.get(i);
			}
		}
		return -1;// caso tenha erro
	}
	*/
	
	
		
	
	
	
} // fim da classe
