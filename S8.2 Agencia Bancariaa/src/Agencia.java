
import java.util.ArrayList;
public class Agencia {
	public int proxIndice;
	public ArrayList<Conta> conta;
	public int numero;
	public float saldo;
	
	
	
	public Agencia(int numero) {
		this.proxIndice = 1;
		this.conta = new ArrayList<>();
		this.numero = numero;
		this.saldo = 0;
		conta.add(new Conta(proxIndice, "ABERTURA DE CONTA ", 0, 0));
		proxIndice +=1;
	}
	
	 public void addConta(String descri, float valor){
	        saldo+= valor;
	        Conta conta = new Conta(proxIndice, descri, valor, saldo);
	        proxIndice+= 1;
	        conta.add(conta);
	        
	    }
	    public void depositar(float valor){
	        if(valor > 0){
	        addConta("deposito de ", valor);
	        }else{if(valor >=0) {
	            System.out.println("Valor Impossivel de ser depositado!");
	        }
	        }
	    }
	    public void tarifa(float valor){
	        if(valor > 0){
	         addConta("tarifa", -valor);
	        }else{
	            System.out.println("Valor Inválido!");
	        }
	    }
	    public void saque(float valor){
	        if(saldo - valor < 0){
	            System.out.println("Valor de Saque Impossivel de ser Feito!");
	            return;
	        }else{if(valor > 0){
	             addConta("saque de ", -valor);
	        }else{
	             System.out.println("Valor Inválido!");
	        }
	        }
	    }
	    public boolean deposito(String nome,float saldo){
	        if(saldo > 0){
	            this.saldo += saldo;
	            return true;
	        }else
	            System.out.println("fail: invalid command");
	        return false;
	    }



		@Override
		public String toString() {
			return "Agencia [proxIndice=" + proxIndice + ", conta=" + conta + ", numero=" + numero + ", saldo=" + saldo
					+ "]";
		}

	    

}


