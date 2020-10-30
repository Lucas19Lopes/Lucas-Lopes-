import java.util.Scanner;
public class Teste {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Maquina maq = new Maquina(0, 0);
	        while(true){
	            String line = scanner.nextLine();
	            String ui[] = line.split(" ");
	            if(ui[0].equals("end")){
	                break;
	            }else if(ui[0].equals("init")){
	                maq = new Maquina(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
	            }else if(ui[0].equals("show")){
	                System.out.println(maq);
	            }else if(ui[0].equals("comprar")){
	                maq.comprar(0);
	            }else if(ui[0].equals("limpa")){
		            maq.limpar();
		      
	            }else if(ui[0].equals("troco"))
	            	maq.troco();

	            
	        }
	    }

}
