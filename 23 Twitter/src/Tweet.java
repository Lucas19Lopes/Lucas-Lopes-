import java.util.TreeMap;

public class Tweet {
	    
	    TreeMap<String, Usuario> curtir;
	    
	    public int idTw;
	    public String username;
	    public String msg;
	    
	    public Tweet(int idTw, String username, String msg){
	        this.idTw = idTw;
	        this.username = username;
	        this.msg = msg;
	        curtir = new TreeMap<>();
	    }
	    
	    public void curtir(Usuario nick){
	            if(curtir.containsKey(nick.nick)){
	                return;
	            }else{
	                curtir.put(nick.nick, nick);
	            }   
	    }
	    
	    public String toString(){
	        String saida = idTw + ":" + username + "( " + msg + ") "+ "[ "; 
	        for(Usuario l : curtir.values())
	            saida+= l.nick + " ";
	        return saida + " ]";
	            
	    }
	    
}



