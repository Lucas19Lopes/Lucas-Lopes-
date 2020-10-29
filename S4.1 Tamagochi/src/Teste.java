import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Tamagochi tama =  new Tamagochi("", 0, 0, 0);
		
		while(true){
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
              tama   = new Tamagochi(ui[1], Integer.parseInt(ui[2]),
                                     Integer.parseInt(ui[3]),
                                     Integer.parseInt(ui[4]));
            }else if(ui[0].equals("show")){
                System.out.println(tama);
            }else if(ui[0].equals("iniciar")) {
       		 	tama.brinca();
            }else if(ui[0].equals("alimenta")) {
           	 	tama.comer();
            }else if(ui[0].equals("banho")) {
           	 	tama.banho();
            }else if(ui[0].equals("soninho")) {
           	 	tama.dormir();
            }else{
                System.out.println("fail: comando invalido");
            }
		}

	}

}


