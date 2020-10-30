import java.util.ArrayList;

public class Contato {
	public String nome;
	public ArrayList<Telefone> contatos;
	public Object getNome;
	public boolean favorito;
	
	
		public Contato(String nome, ArrayList<Telefone> contatos) {
			this.nome = nome;
			contatos = new ArrayList<>();
	        favorito = false;
		}
	
 

		public boolean addFone(String nome, String numero){
    		Telefone telefone = new Telefone(nome,numero);
    		if(telefone.validar(numero)){
    			contatos.add(new Telefone(nome,numero));
    			return true;
    		}else{
    			System.out.println("fail: Telefone invalido!");
    		}
    		return false;
    	}
     
        public void rmTelefone(int indice){
            for(int i = 0; i < contatos.size(); i++){
                Telefone telefone = contatos.get(i);
                if(i == indice){
                    contatos.remove(contatos.get(i));
                }
            }

        }
        public String getNome(){
            return this.nome;
        }

    	

        public int comparaContato(Contato um, Contato dois){
            return um.nome.compareTo(dois.nome);
        }
        @Override
        public String toString(){
            
            String saida =  "- " + this.nome;
            if(isFavoritado())
                saida += "@ " + this.nome;
            
            else
                saida += "- " + this.nome;
            

            if(contatos.size() > 0)
                saida += " ";
            for(int index = 0; index < contatos.size(); index++){
                Telefone telefone = contatos.get(index);
                saida += "[" + index + ":"+ telefone + "]";
            }
            return saida;
        }
        public void setFavoritado(boolean favorito2){
            this.favorito = favorito2;
        }




		boolean isFavoritado() {
			return this.favorito;
		}


}
