package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="facturas")
public class Bill extends BaseEntity {
	
	@Override
	public String toString() {
		return "Bill [idNumber=" + idNumber + ", paymentDate=" + paymentDate + ", money=" + money + ", visit=" + visit
				+ "]";
	}

	@Digits(integer=10, fraction=0)
	@NotNull
	private long idNumber;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
	@NotNull
	private Date paymentDate;
	
	@Digits(integer=5, fraction=2)
	@DecimalMin("0.0")
	@NotNull
	private double money;
	

	
	public Bill () {
		
	}
	
	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "bill", cascade = CascadeType.ALL)
	private Visit visit;

	public Visit getVisit() {
		return visit;
	}

	public void setVisit(Visit visit) {
		this.visit = visit;
	}
}
