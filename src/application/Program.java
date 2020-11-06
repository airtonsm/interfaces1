package application;

import model_services.ServicoPagamentoOnline;
import model_services.ServicoPaypal;

public class Program {

	public static void main(String[] args) {
		
		ServicoPagamentoOnline ps = new ServicoPaypal();
				
		System.out.println(ps.taxaPagamento(200.00));

	}

}
