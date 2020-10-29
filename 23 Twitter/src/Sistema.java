import java.util.TreeMap;

public class Sistema {
	TreeMap<String, Usuario> usuario;
	public int nextId;
	
	
	
	
	public Sistema() {
		usuario = new TreeMap<>();
		this.nextId = 0;
	}

	void addUsuario(String nick) {
		 if(usuario.containsKey(nick))
	            return;
	        usuario.put(nick, new Usuario(nick));
		
	}
	
	void enviarMensagem(String remetente, String destinatario, String msg) {
		this.usuario.get(remetente).enviarMensagem(this.usuario.get(destinatario), msg);
		
	}
	
	void readMensagem(String usuario) {
		System.out.println(this.usuario.get(usuario).getMensagens());
		
	}
	public void Twitar(String nick, String msg){
      
		Tweet tw = new Tweet(nextId, nick, msg);
        nextId+=1;
        this.usuario.get(nick).twitar(tw);
    }
	public void listarUsuarios(){
        for(Usuario use : usuario.values()){
            System.out.println(use);  
        }
    }

}
