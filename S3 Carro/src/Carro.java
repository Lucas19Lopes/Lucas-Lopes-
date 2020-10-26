public class Carro {
	int nPessoas = 0;
	int maxPessoas = 2;
	float gasolina = 0;
	float maxGasolina= 100;
	float kmPorLitro = 1;
	float distancia;

	boolean embarcar(){
		if (this.nPessoas < this.maxPessoas){
			this.nPessoas += 1;
			System.out.println("embarcou");
			return true;
		}
		System.out.println("ta lotado");
		return false;
	}


	void desembarcar(){  
		this.nPessoas -= 1;
		System.out.println("desembarcou");
	}


	boolean colocarGasolina() {
		if(this.gasolina < this.maxGasolina) {
			this.gasolina += 1;
			System.out.println("Colocando Gasolina");
			return true;
		}
		System.out.println("Tanque Cheio");
		return false;
	}





	void dirigir(float distancia) {
		if(this.nPessoas >= 0 && this.gasolina > distancia) {
			this.gasolina -= distancia;
			return;
		}

	}
}
