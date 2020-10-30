
public class Telefone {
	public String numero;
	public String nome;
	public Telefone(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", nome=" + nome + "]";
	}
    public boolean validar(String numero){
        String validos = "0123456789().-";
        for(int i = 0; i < numero.length();i++){
            char c = numero.charAt(i);
            if(validos.indexOf(c) == -1){
                return false;
            }
        }
        return true;

    }
    
}
