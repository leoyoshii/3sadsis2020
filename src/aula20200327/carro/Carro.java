package aula20200327.carro;

public class Carro {
	private double gastoPorAcao = 0.25;
	private boolean ligado;
	private double totalCombustivel;

	public Carro(double combustivelInicial) {
		this.totalCombustivel = combustivelInicial;
		this.ligado = false;
	}
	public void abastecer(double abastecido){
		totalCombustivel += abastecido;
	}

	public void ligar() {
		if(totalCombustivel>=gastoPorAcao){
			ligado = true;
			totalCombustivel -= gastoPorAcao;
		}
	}
	public void desligar() {
		ligado = false;
	}

	public double CombustivelRestante(){
		return totalCombustivel;
	}

	public boolean isLigado(){
		if(ligado){
			return true;
		}else{
			return false;
		}
	}
	public void Acelerar(){
		if(ligado && totalCombustivel>=gastoPorAcao){
			totalCombustivel -= gastoPorAcao;
		}else{
			desligar();
		}
	}

}
