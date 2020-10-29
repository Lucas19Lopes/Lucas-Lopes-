import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    ArrayList<Contato> contato;

	public Agenda(ArrayList<Contato> contato) {
		contato = new ArrayList<>();
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
        contato.remove(contatop);
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





    
    
    


}
