package com.bank.report.proxy;

import org.springframework.web.reactive.function.client.WebClient;

import com.bank.report.model.History;

import reactor.core.publisher.Flux;

public class ReportProxy {
	
	private final WebClient.Builder webClientBuilder = WebClient.builder();
	
	//get commissions by product
	public Flux<History> getCommissions(String idProduct){
		return webClientBuilder.build()
								.get()
								.uri("http://localhost:8090/history/byProductAndType/{idProduct}/{type}", idProduct, "commission")
								.retrieve()
								.bodyToFlux(History.class);
	}

} 
