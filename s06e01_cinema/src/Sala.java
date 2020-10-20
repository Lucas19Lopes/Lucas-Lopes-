import java.util.ArrayList;

public class Sala {
	private ArrayList<Cliente> lugar; 
	
	public Sala(int lotacao){
        lugar = new ArrayList<Cliente>();
        for(int i = 0; i < lotacao; i++)
            lugar.add(null);
    }
    public int getLotacao(){
        return lugar.size();
    } 
    public void out(String nome , String telefone, int indice){
        for(int i = 0; i < this.lugar.size(); i++)
            if(this.lugar.get(i) != null && lugar.get(i).cliente.equals(id , fone)){
                this.lugar.set(i, null);
                break;
            }
   
    }   
    public boolean reservar(String nome, String telefone, int indice){
    	if(indice < 0  || indice >= this.getLotacao()) {
    		System.out.println("Essa cadeira é não tem no cinema, mas se quer tanto compre um monte de cadeira e sente nesse Lugar");
            return false;
    	}
    	if(lugar.get(indice) != null){
            System.out.println("Meu amigo esse lugar ta ocupado, mas me diz o QUANTO você quer esse lugar ? $_$");
            return false;
    }
    	 if(lugar.get(indice) != null){
             System.out.println("cadeira ocupada meu amigo");
             return false;
         
    	 
    	 
    	 }
         for(Cliente cliente : lugar){
             if(cliente != null && cliente.id.equals(id)){
                 System.out.println("Tem duas bundas?");
                 return false;
         }
            
             
             
         }
         lugar.set(indice, new Cliente(id, fone));
         return true;

         
     
}
    public String toString(){
        String saida = "[ ";
        for(Cliente cliente : lugar)
            if(cliente == null)
                saida +=  "- ";
            else
                saida += cliente + " ";
        return saida + "]";
    }
	public void out(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	void remove(String nome){
        for(int i = 0; i < this.cadeiras.size(); i += 1){
            Cliente cliente = this.cadeiras.get(i);
            if((cliente != null) && (cliente.id.equals(nome))){
                this.cadeiras.set(i, null);
		    
	    }

}
