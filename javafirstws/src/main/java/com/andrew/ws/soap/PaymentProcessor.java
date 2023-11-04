package com.andrew.ws.soap;

import com.andrew.ws.soap.dto.PaymentProcessorRequest;
import com.andrew.ws.soap.dto.PaymentProcessorResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import org.apache.cxf.feature.Features;

@WebService(name = "PaymentProcessor")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface PaymentProcessor {

	@WebMethod
	public @WebResult(name = "response") PaymentProcessorResponse processPayment(
			@WebParam(name = "paymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
