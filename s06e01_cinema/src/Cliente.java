
public class Cliente {
	String nome;
	String telefone;
	
	Cliente cliente;
	
	public Cliente(String nome, String telefone){
		this.nome = nome;
	        this.telefone = telefone;
	    
	}
	
	public String toString(){
		return nome + ":" + telefone;
	
	
	}
	
	
	public boolean equals(String nome, String telefone) {
		this.nome = nome;
	        this.telefone = telefone;
		return false;
}
}
