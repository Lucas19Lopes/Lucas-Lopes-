import java.util.Scanner;

public class Teste {
		Scanner scanner = new Scanner(System.in);
    
		Agenda agenda = new Agenda();
    
		while(true){
			String line = scanner.nextLine();
			System.out.println("$" + line);
			String ui[] = line.split(" ");
        
			if(ui[0].equals("end")){
				break;
			}else if(ui[0].equals("add")){ 
				agenda.initContato(ui[1]);
				for(int i = 2; i < ui.length; i++){
					String partes[] = ui[i].split(":");
					agenda.addContato(ui[1], partes[0], partes[1]);
				}
			}else if(ui[0].equals("agenda")){ 
				agenda.show();
			}else if(ui[0].equals("remover Contato")){ 
				agenda.rmContato(ui[1]);
			}else if(ui[0].equals("search")){ 
				agenda.search(ui[1]);
			}else if(ui[0].equals("remover Telefone")){ 
				agenda.rmTelefoneIndice(ui[1], Integer.parseInt(ui[2]));
			}else if(ui[0].equals("show")){
            	agenda.show();
			}else if(ui[0].equals("favoritos")){ 
				agenda.favoritarContato(ui[1]);
			}else if(ui[0].equals("favoritar")){ 
				agenda.favoritar();
			}else if(ui[0].equals("desfavoritar")){ 
				agenda.desfavoritarContato(ui[1]);
			}else
				System.out.println("fail: comando inválido!");
		}
		scanner.close();

	}

}
