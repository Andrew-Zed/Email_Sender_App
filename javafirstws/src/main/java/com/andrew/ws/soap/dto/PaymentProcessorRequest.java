package com.andrew.ws.soap.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentProcessorRequest {
	@XmlElement(name = "creditCardInfo", required = true)
	private CreditCardInfo creditCardInfo;
	@XmlElement(name = "amount")
	private Double amount;

	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
