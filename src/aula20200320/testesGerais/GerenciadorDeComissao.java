package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
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

}
