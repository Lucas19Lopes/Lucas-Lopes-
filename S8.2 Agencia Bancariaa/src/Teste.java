import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Agencia nConta = new Agencia(0);
        
		while(true){
            String line = scan.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                nConta = new Agencia(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("show")){
                System.out.println(nConta);
            }else if(ui[0].equals("saque")){
                nConta.saque(0);;
            }else if(ui[0].equals("deposito")){
	            nConta.depositar(0);
	      
            }else if(ui[0].equals("add"))
            	nConta.addConta(null, 0);;

            
        }        
        
        
        
       

	}
}
