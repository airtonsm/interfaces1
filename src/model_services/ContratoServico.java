package model_services;

import java.util.Calendar;
import java.util.Date;

import model_entities.Contrato;
import model_entities.Prestacao;

public class ContratoServico {
	
	private ServicoPagamentoOnline servicoPagamento;
	
	public ContratoServico(ServicoPagamentoOnline servicoPagamento) {
	this.servicoPagamento = servicoPagamento;
	
	}
	
	public void processoContrato(Contrato contrato, int meses) {
		
		double parcelaBasica = contrato.getValorTotal() / meses;
		
		for (int i=1; i <= meses; i++) {
			
			double parcelaAtualizada = parcelaBasica + servicoPagamento.juros(parcelaBasica, i);
			
			double parcelaTotal = parcelaAtualizada + servicoPagamento.taxaPagamento(parcelaAtualizada);
			
			Date dataVencimento = adicionarMeses(contrato.getData(), i);
			
			contrato.getPrestacao().add(new Prestacao(dataVencimento, parcelaTotal));
			
		}
	}
	
	private Date adicionarMeses(Date data, int N) {
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(data);
	calendar.add(Calendar.MONTH, N);
	return calendar.getTime();
}
	
}