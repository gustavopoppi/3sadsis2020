package aula20032020.testesGerais;

public class GerenciadorDeComissao {

	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao / 100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda,
			double percentualDeComissao) {
		double comissao = valorDaVenda * (percentualDeComissao / 100.00);
		if (comissao < valorMinimo) {
			return valorMinimo;
		}
		return comissao;
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda,
			double percentualDeComissao) {

		double comissao = valorDaVenda * (percentualDeComissao / 100.00);
		
		if (comissao < valorMinimo) {
			return valorMinimo;
		} else if (comissao > valorMaximo) {
			return valorMaximo;
		}
		return comissao;
	}
}
