package model_services;

public interface ServicoPagamentoOnline {
	
	double taxaPagamento(double montante);
	double juros(double montante, int meses);

}
