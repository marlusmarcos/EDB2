
public class No {
    
	public int valor;
    public No dir;
    public No esq;
    
    public No(int valor) {
		this.valor = valor;
	}
    
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getDir() {
		return dir;
	}
	public void setDir(No dir) {
		this.dir = dir;
	}
	public No getEsq() {
		return esq;
	}
	public void setEsq(No esq) {
		this.esq = esq;
	}
}
