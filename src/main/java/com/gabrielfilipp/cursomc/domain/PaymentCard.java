package com.gabrielfilipp.cursomc.domain;

import javax.persistence.Entity;

import com.gabrielfilipp.cursomc.domain.enums.StatusPayment;

@Entity
public class PaymentCard extends Payment {
	private static final long serialVersionUID = 1L;

	private Integer numberParcelas;
	
	public PaymentCard(Integer id, StatusPayment statusPayment, Pedido pedido,Integer numberParcelas) {
		super(id, statusPayment, pedido);
		this.numberParcelas = numberParcelas;
	}

	public Integer getNumberParcelas() {
		return numberParcelas;
	}

	public void setNumberParcelas(Integer numberParcelas) {
		this.numberParcelas = numberParcelas;
	}
	
	


//	private static final long serialVersionUID = 1L;

//	private Integer numeroDeParcelas;

//	public PaymentCard(
//	Integer id, StatusPayment statusPayment, Pedido pedido,
//			Integer numeroDeParcelas) {
//		super(id, statusPayment, pedido);
//		this.setNumeroDeParcelas(numeroDeParcelas);
//	}

//	public Integer getNumeroDeParcelas() {
//		return numeroDeParcelas;
//	}

//	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
//		this.numeroDeParcelas = numeroDeParcelas;
//	}
//}
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}

}
