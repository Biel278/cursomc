package com.gabrielfilipp.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gabrielfilipp.cursomc.domain.enums.StatusPayment;

@Entity
public class PaymentBoleto extends Payment {

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dateVencimento;

	@Temporal(TemporalType.DATE)
	private Date datePayment;

	public PaymentBoleto(Integer id, StatusPayment statusPayment, Pedido pedido,Date datePayment, Date dateVencimento ) {
		super(id, statusPayment, pedido);
		this.datePayment = datePayment;
		this.dateVencimento = dateVencimento;
	}

	public Date getDateVencimento() {
		return dateVencimento;
	}

	public void setDateVencimento(Date dateVencimento) {
		this.dateVencimento = dateVencimento;
	}

	public Date getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}

}
