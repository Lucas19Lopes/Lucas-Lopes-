
public class Teste {

	public static void main(String[] args) {
		
		 Carro carro = new Carro();
	        Carro carro2 = carro;
	        carro.embarcar();
	        carro.embarcar();
	        carro.embarcar();
	        carro.desembarcar();
	        carro.colocarGasolina();
	        carro.colocarGasolina();
	        carro.dirigir(3);
	        
	        System.out.println(carro.nPessoas);
	        System.out.println(carro2.nPessoas);
	        
	        System.out.println(carro.gasolina);
	        
	        



	}

}
