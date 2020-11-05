package model_entities;

import java.util.Date;

public class Prestacao {
	
	private Date dataVencimento;
	private Double montante;
	
	public Date getDataVencimento() {
		
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Double getMontante() {
		return montante;
	}
	public void setMontante(Double montante) {
		this.montante = montante;
	}
	
	

}
