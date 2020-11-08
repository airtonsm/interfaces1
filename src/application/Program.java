package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model_entities.Contrato;
import model_entities.Prestacao;
import model_services.ContratoServico;
import model_services.ServicoPaypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);		

			System.out.println("Entre com os dados do contrato: ");
			System.out.print("Number: ");
			Integer numero = sc.nextInt();
			System.out.print("Date (dd/MM/yyyy): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor do contrato: ");
			Double valorTotal = sc.nextDouble();			
			
			Contrato contrato = new Contrato(numero, data, valorTotal);
			
			System.out.print("Entre com os numero de meses: ");
			int N = sc.nextInt();
			
			ContratoServico cs = new ContratoServico(new ServicoPaypal());
			
			cs.processoContrato(contrato, N);
			
			System.out.println("Prestações: ");
			
			for(Prestacao it : contrato.getPrestacao())
				System.out.println(it);
				
			
			
	

			sc.close();
	}

}
