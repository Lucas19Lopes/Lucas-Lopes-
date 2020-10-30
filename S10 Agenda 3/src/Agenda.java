import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
	ArrayList<Contato> contato;
    ArrayList<Contato>  favoritos;

	public Agenda() {
		contato = new ArrayList<>();
		favoritos = new ArrayList<>();
	}
	
    Contato getContato(String nome){
        for(Contato cont: contato){
            if(cont.getNome.equals(nome)){
                return cont;
            }
        }
        return null;
    }
    public boolean initContato(String name){
        
        Contato cont = getContato(name);
        if(cont != null) return false;
        this.contato.add(new Contato(name, null));
        return true;
    }
    public void addContato(String name, String nome, String numero){
        Contato contatop = getContato(name);
        
        if(contatop == null){
            contatop = new Contato(name, null);
            contatop.addFone(nome, numero);
        }
        else if(contatop != null){
            contatop.addFone(nome, numero);    
        }
        
        Collections.sort(contato,(Contato um , Contato dois) -> um.getNome().compareTo(dois.getNome()));
    }
    public boolean rmContato(String name){
        
        Contato contatop = getContato(name);
        if(contatop == null){
            return false;
        }
        desfavoritarContato(name);
        contato.remove(contatop);
        return true;
    }
    boolean desfavoritarContato(String name) {
    	 Contato contatop = getContato(name);
         if(contato == null){
             return false;
         }
         favoritos.remove(contatop);
         return true;

     }
     

	public void search(String search){
        
        ArrayList<Contato> aux = new ArrayList<>();
        for(Contato contact : contato){
            if(contact.toString().indexOf(search) != -1){
                aux.add(contact);
            }    
        }
        for(int aux2 = 0; aux2 < aux.size(); aux2++)
            System.out.println(aux.get(aux2));
    }
    public void rmTelefoneIndice(String name, int index){
        Contato contato = getContato(name);
        
        if(contato != null)
            contato.rmTelefone(index);
    }
    
    public ArrayList<Contato> getContatos(){
        return contato;
    }
    
    public void show(){
        for(int i = 0; i < contato.size(); i++){
            System.out.println(contato.get(i));
        }
        
    }

	public void favoritarContato(String  name) {
		Contato contatop = getContato(name);
        
        if(contatop == null){
            return;   
        }
        if(contatop.isFavoritado()){
            return;
        }    
        contatop.setFavoritado(true);
        favoritos.add(contatop);
		
		
	}

	public void favoritar() {
		 for(int i = 0; i < favoritos.size(); i++){
             System.out.println(favoritos.get(i));
         }
     }
		

}
