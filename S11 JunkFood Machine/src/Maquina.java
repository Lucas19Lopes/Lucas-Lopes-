  
import java.util.ArrayList;

import tamagochi.Espiral;


class Maquina {
	private ArrayList<Espiral> esp;
	private int numeroEspirais;
	private double saldo;
	private int maximoDeProdutos;
	private float saldoCliente;
	private float ganhos;
	
	public Maquina(int numeroEspirais, int maximoDeProdutos) {
		this.numeroEspirais = numeroEspirais;
		this.maximoDeProdutos = maximoDeProdutos;
		
		esp = new ArrayList<Espiral>();
		for(int i = 0; i < numeroEspirais; i++)
			this.esp.add(null);
	}
	
	
	
	public ArrayList<Espiral> getEsp() {
		return esp;
	}



	public void setEsp(ArrayList<Espiral> esp) {
		this.esp = esp;
	}



	public int getNumeroEspirais() {
		return numeroEspirais;
	}



	public void setNumeroEspirais(int numeroEspirais) {
		this.numeroEspirais = numeroEspirais;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public int getMaximoDeProdutos() {
		return maximoDeProdutos;
	}



	public void setMaximoDeProdutos(int maximoDeProdutos) {
		this.maximoDeProdutos = maximoDeProdutos;
	}



	public float getSaldoCliente() {
		return saldoCliente;
	}



	public void setSaldoCliente(float saldoCliente) {
		this.saldoCliente = saldoCliente;
	}



	public float getGanhos() {
		return ganhos;
	}



	public void setGanhos(float ganhos) {
		this.ganhos = ganhos;
	}



	@Override
	public String toString() {
		return "Maquina [esp=" + esp + ", numeroEspirais=" + numeroEspirais + ", saldo=" + saldo + ", maximoDeProdutos="
				+ maximoDeProdutos + ", saldoCliente=" + saldoCliente + ", ganhos=" + ganhos + "]";
	}
	public boolean set(int indice, String nome, int quantidade, float valor) {
		if(indice < 0 || indice >= getEsp()) {
		return false;
		}
		if(esp.get(indice) != null) {
			return false;
		}
		esp.set(indice, new Espiral(indice, nome, quantidade, valor));
		return true;
	}
	public void limpar() {
		if(esp.get(indice) != null) {
			esp.set(indice, null);
		}else if(indice > getEsp()-1) {
			System.out.println("Indice digitado não existe.");
		}else {
			System.out.println("O produto não está na posição indicada" + indice);
		}
	}
	public void comprar(int indice) {
		int sizeEspirais = getEsp()-1;
		
		for(Espiral produto : esp) {
			if(produto != null) {
				if(produto.indice == indice) {
					if((this.saldoCliente > produto.preco) && (produto.quantidade > 0)) {
						System.out.println("Você comprou um " + produto.getNome());
						setSaldo(this.saldoCliente - produto.preco);
						produto.setQuantidade(produto.getQuantidade()-1);
						break;
					}
					else if((this.saldoCliente > 0) && (produto.quantidade == 0)) {
						System.out.println("fail: A espiral está sem produto.");
						break;
					}
					else if((this.saldoCliente < produto.preco) && (this.saldoCliente > 0 || 
							this.saldoCliente == 0) && (produto.quantidade > 0)) {
						System.out.println("fail: Seu saldo é insuficiente.");
						break;
					}
				}
				else if(indice > sizeEspirais) {
					System.out.println("fail: indice digitado não existe.");
					break;
				}
			}
		}
		
	}
	public void troco() {
		System.out.println("Você recebeu: " + getSaldoCliente() + "0 R$");
		setSaldoCliente(0);
	}
	public void dinheiro(float valor) {
			setSaldoCliente(getSaldoCliente() + valor);
		}
	public String toString() {
		int indice = 0;
		String saida = "Saldo: " + getSaldoCliente() + "0\n";
			for(Espiral produto : esp) {
				if((produto == null) && indice < (getQuantidade())) {
					saida += indice + " [0.00 R$ ] \n";
			    }else if((produto != null) && (indice < getQuantidade())) {
			    	saida += indice + " [ "+ produto + "] \n";
			    }indice ++; 
		
	        }
			return saida;
  }



	private int getQuantidade() {
		// TODO Auto-generated method stub
		return getQuantidade();
	}
}
