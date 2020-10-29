
public class Mensagem {
	String remetente;
	String texto;
	public Mensagem(String remetente, String texto) {
		this.remetente = remetente;
		this.texto = texto;
	}
	@Override
	public String toString() {
		return "[Remetente = " + remetente + ", Mensagem = " + texto + "]";
	}
	
	
	
	
	
	

}
