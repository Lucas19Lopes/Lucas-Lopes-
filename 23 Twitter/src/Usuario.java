import java.util.ArrayList;
import java.util.TreeMap;
public class Usuario {
	String nick;
	ArrayList<Mensagem> inbox;
	private int naoLidos;
	public ArrayList<Tweet> timeline;
	public ArrayList<Tweet> meusTweets;
	public TreeMap<String, Usuario>seguidos;
	public TreeMap<String, Usuario> seguidores;
	
	
	
	
	
	public Usuario(String nick) {
		this.nick = nick;
		this.inbox = new ArrayList<>();
		timeline = new ArrayList<>();
	    meusTweets = new ArrayList<>();
	    seguidos = new TreeMap<>();
	    seguidores = new TreeMap<>();  
	}
	
	public void  enviarMensagem(Usuario destinatario, String texto) {
		Mensagem msg = new Mensagem(this.nick, texto);
		destinatario.inbox.add(msg);
		destinatario.naoLidos += 1;
	}
	
	String getMensagens(){
		String saida = null;
		if(inbox.size() == 0)
			saida = "Sem Mensagens";

		//		for (Mensagem msg : inbox)
//			sair += msg + "\n";
//		inbox.clear();
		for (int i  = inbox.size() - naoLidos; i < inbox.size(); i++)
			saida += inbox.get(i) + "\n";
		naoLidos = 0;
		return saida;
		
	}
	public void seguir(Usuario outro){
        if(seguidos.containsKey(outro.nick)){
            return;
        }    
        seguidos.put(outro.nick, outro);
        outro.seguidores.put(this.nick, this);
        System.out.println("Seguido com sucesso!");
	}
	public void twitar(Tweet tweet){
        
        this.timeline.add(tweet);
        this.naoLidos+= 1;
        for(Usuario u : seguidores.values()){
            u.timeline.add(tweet);
            u.naoLidos+=1;
        }
        System.out.println("sucesso");
    }
	public void pegarTimeline(Usuario usuario){
        if(naoLidos == 0)
            System.out.println("Timeline vazia!");
        for(int i = usuario.timeline.size() - usuario.naoLidos; i < usuario.timeline.size();i++){
            System.out.println(usuario.timeline.get(i));
            naoLidos = 0;
        }
    }
	public void curtir(int idTw){
        for(int i = 0; i < timeline.size();i++){
            if(timeline.get(i).idTw == idTw){
                this.timeline.get(i).curtir(this);
                System.out.println("curtido");
            }
        }
    }
        
        public String toString(){
            String saida = nick + " \n";
            saida += "Seguidores [";
            for(Usuario seguidores : seguidores.values())
                saida += seguidores.nick + " ";
            saida += "] \n";
            saida += "Seguidos [";
            for(Usuario seguidos : seguidos.values())
                saida += seguidos.nick + " ";
            return saida + "]";
        }

	
}
