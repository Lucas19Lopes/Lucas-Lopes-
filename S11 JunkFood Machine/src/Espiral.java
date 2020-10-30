
public class Espiral {
	private String nome;
	double preco;
	int quantidade;
	int indice;
	
	

	public Espiral(String nome, double preco, int quantidade, int indice) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.indice = indice;
	}



	@Override
	public String toString() {
		return "Espiral [nome= " + this.nome + ", preco= " + this.preco + ", quantidade = " + this.quantidade + "]";
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public int getIndice() {
		return indice;
	}



	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	
	
	
	

}
