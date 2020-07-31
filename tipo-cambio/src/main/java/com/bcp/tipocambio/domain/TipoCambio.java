package com.bcp.tipocambio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCambio {
	private Double monto;
	private Double tipMoneOrig;
	private Double tipMoneDest;
	private Double montoCamb;
	private Double tipoCamb;
	
	public TipoCambio(Double monto, Double tipMoneOrig, Double tipMoneDest, Double montoCamb, Double tipoCamb) {
		super();
		this.monto = monto;
		this.tipMoneOrig = tipMoneOrig;
		this.tipMoneDest = tipMoneDest;
		this.montoCamb = montoCamb;
		this.tipoCamb = tipoCamb;
	}
	
	
	
}
