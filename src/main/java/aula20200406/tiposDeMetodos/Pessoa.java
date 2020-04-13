package aula20200406.tiposDeMetodos;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;


	public Pessoa(String nome, int idade, double peso, double altura){
		setNome(nome);
		setAltura(altura);
		this.idade=idade;
		this.peso=peso;
	}


	public double getIMC() {
		return peso / (altura * altura);
	}

	// Olha um getter aqui!
	public String getNome() {
		return this.nome;
	}

	// Olha um setter aqui!
	public void setNome(String nome) {
		if(nome.trim().length() <= 1 || nome == null ){
			throw new RuntimeException();
		}else{
			this.nome = nome;
		}
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		if(altura <= 0.25){
			throw new RuntimeException();
		}else{
			this.altura = altura;
		}
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new RuntimeException("Peso deve ser maior que zero!");
		}
		this.peso = peso;
	}

}
