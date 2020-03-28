package aula20200327.carro;

public class AppCarro {
	
	public static void main() {		
		Carro Fusca = new Carro(20);
		Carro Ferrari = new Carro(10);
				
		Fusca.ligar();
		Ferrari.ligar();
		
		Fusca.Acelerar();
		Ferrari.Acelerar();
		
		System.out.println("Fusca está ligado?"+ Fusca.isLigado());
		System.out.println("Ferrari está ligado?"+ Ferrari.isLigado());

		System.out.println("Combustivel restante "+ Fusca.CombustivelRestante());
		System.out.println("Combustivel restante "+ Ferrari.CombustivelRestante());
	}
}
