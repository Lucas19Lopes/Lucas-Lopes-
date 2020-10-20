import java.util.Scanner;

public class Cinema { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sala sala = new Sala(0); 
		while(true){
			String line = scan.nextLine();
			String[]ui = line.split(" ");
			if(ui[0].equals("end")){
				break;
			}else if(ui[0].equals("tamanho")){
            sala = new Sala(Integer.parseInt(ui[1]));
            
			}else if(ui[0].equals("galera")){
				System.out.println(sala);
			}else if(ui[0].equals("reservar")){
				sala.reservar(ui[1], ui[2], Integer.parseInt(ui[3]));
			}else if(ui[1].equals("remove")){
				sala.out(ui[1] == null );
			}else{
				System.out.println("fail: comando invalido");
				}
		}
		
		scan.close();
        
	}
}
