import java.util.Scanner;

public class Teste {


	public static void main(String[] args) {
		Sistema s = new Sistema();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("add")){
                s.addUsuario(ui[1]);
            }else if(ui[0].equals("seguir")){
                Usuario user1 = s.usuario.get(ui[1]);
                Usuario user2 = s.usuario.get(ui[2]);
                user1.seguir(user2);
            }else if(ui[0].equals("listar")){
                s.listarUsuarios();
            }else if(ui[0].equals("msg")){
                s.enviarMensagem(null, line, line);
            }else if(ui[0].equals("twitar")){
                String aux="";
                for(int i=2; i < ui.length; i++){
                    if(i==ui.length -1){
                        aux+=ui[i];
                    }else{
                        aux += ui[i] + " ";
                    }
                }
                s.Twitar(ui[1], aux);
            }else if(ui[0].equals("timeline")){
                Usuario user1 = s.usuario.get(ui[1]);
                user1.pegarTimeline(user1);
            }else if(ui[0].equals("curtir")){
                Usuario user1 = s.usuario.get(ui[1]);
                user1.curtir(Integer.parseInt(ui[2]));    
            }else{
                System.out.println("Comando inválido!");
            } 
        }
        scan.close();

		
		
	}

}
