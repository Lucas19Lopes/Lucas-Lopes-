
public class Tamagochi {
	private String nome;
	private int energia;
	private int fome;
	private int limpa;
	private int energiaMx = 15;
	private int fomeMx = 15;
	private int limpaMx = 10;
	private Tamagochi bixinho;
	boolean vivo ;
	
	
	
	
	public Tamagochi(String nome, int energia, int fome, int limpa) {
		super();
		this.nome = nome;
		this.energia = energia;
		this.fome = fome;
		this.limpa = limpa;
		this.energiaMx = energiaMx;
		this.fomeMx = fomeMx;
		this.limpaMx = limpaMx;
		this.vivo = true;
	}
	
	
	
	@Override
	public String toString() {
		return "Tamagochi [nome=" + nome + ", energia=" + energia + ", fome=" + fome + ", limpa=" + limpa
				+ ", energiaMx=" + energiaMx + ", fomeMx=" + fomeMx + ", limpaMx=" + limpaMx + "]";
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		if(energia > this.energiaMx) {
			this.energia = energiaMx;
		}else if(energia <= 0) {
			this.energia = 0;
			this.vivo = false;
			System.out.println("Seu bixinho morreu.");
		}else
			this.energia = energia;
	}
	public int getFome() {
		return fome;
	}
	public void setFome(int fome) {
		if(fome > fomeMx)
			this.fome = fomeMx;
		else if(fome <= 0) {
			this.fome = 0;
			this.vivo = false;
			System.out.println("Seu Bixinho Morreu de fome, que falta de responsabilidade.");
		}else
			this.fome = fome;
		
	}
	public int getLimpa() {
		return limpa;
	}
	public void setLimpa(int limpa) {
		if(limpa > limpaMx)
			this.limpa = limpaMx;
		if(limpa <= 0) {
			this.limpa = 0;
			this.vivo = false;
			System.out.println("Seu bixinho morreu, você não deu o bannho nele. morreu sujo e com um calor dos infernos.");
		
		}else
			this.limpa = limpa;
	}
	public int getEnergiaMx() {
		return energiaMx;
	}
	public void setEnergiaMx(int energiaMx) {
		this.energiaMx = energiaMx;
	}
	public int getFomeMx() {
		return fomeMx;
	}
	public void setFomeMx(int fomeMx) {
		this.fomeMx = fomeMx;
	}
	public int getLimpaMx() {
		return limpaMx;
	}
	public void setLimpaMx(int limpaMx) {
		this.limpaMx = limpaMx;
	}



	public Tamagochi getBixinho() {
		return bixinho;
	}



	public void setBixinho(Tamagochi bixinho) {
		this.bixinho = bixinho;
	}

	public void comecar(Tamagochi bixinho) {
		if(this.bixinho == null) {
			this.bixinho = bixinho;
		}

	}
		
	private boolean vivo() {
		if(!this.vivo == true)
			return true;
		else {
			
			return false;
		}
	}
	public void brinca() {
		if(this.vivo())
			return;
		this.bixinho.setEnergia(this.bixinho.getEnergia() - 3);
		this.bixinho.setFome(this.bixinho.getFome() - 1);
		this.bixinho.setLimpa(this.bixinho.getLimpa() - 2);
		
		
	}
	
	public void banho() {
		if(this.vivo())
			return;
		int v = this.bixinho.limpaMx - this.bixinho.getLimpa();
		this.bixinho.setEnergia(this.bixinho.getEnergia() - 1);
		this.bixinho.setFome(this.bixinho.getFome() - 1);
		this.bixinho.setLimpa(this.bixinho.getLimpa() + v);
		
	}
	public void dormir() {
		if(this.vivo())
			return;
		if(this.bixinho.energiaMx - this.bixinho.energia <= 5) {
			System.out.println(" O bxinho que brincar e não está com sono");
			return;
		}
		this.bixinho.setEnergia(this.bixinho.getEnergiaMx());
	}
	
	public void comer() {
		if(this.vivo())
			return;
		this.bixinho.setEnergia(this.bixinho.getEnergia() - 1);
		this.bixinho.setFome(this.bixinho.getFome() - 3);
		this.bixinho.setLimpa(this.bixinho.getLimpa() - 2);

	}

}
