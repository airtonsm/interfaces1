package model_services;

public class ServicoPaypal implements ServicoPagamentoOnline{
	
	private static final double taxa_juros = 0.02;
	private static final double juros_mensal = 0.01;

	@Override
	public double taxaPagamento(double montante) {		
		return montante * taxa_juros;
	}

	@Override
	public double juros(double montante, int meses) {
		return montante * meses * juros_mensal;
	}
	
		
	
}
