package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
<<<<<<< HEAD
		double comissao = 0;
		comissao = valorDaVenda * (percentualDeComissao/100.00);
		if (comissao > valorMinimo){
			return comissao;
		} else {
			return valorMinimo;
		}
	}

	public static double calcularComissaoComFaixa(double valorMinimo,double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		double comissao = 0;
		comissao = valorDaVenda * (percentualDeComissao/100.00);
		if (comissao > valorMinimo){
			if(comissao < valorMaximo){
				return comissao;
			}
			else{
				return valorMaximo;
			}
		} else {
			return valorMinimo;
		}
	}

=======
		double valorDaComissao = calcularComissaoPadrao(valorDaVenda, percentualDeComissao);
		if (valorDaComissao < valorMinimo) {
			return valorMinimo;
		} 
		return valorDaComissao;		
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		double valorDaComissao = calcularComissaoComValorMinimo(valorMinimo, valorDaVenda, percentualDeComissao);
		if (valorDaComissao > valorMaximo) {
			return valorMaximo;
		}
		return valorDaComissao;
	}


>>>>>>> 3f7817dc8de63fb45aae9c6d4a6f39b69fe5fcea
}
