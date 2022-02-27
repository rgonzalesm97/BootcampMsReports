package com.bank.report.proxy;

import org.springframework.web.reactive.function.client.WebClient;

import com.bank.report.model.Account;
import com.bank.report.model.Credit;
import com.bank.report.model.History;

import reactor.core.publisher.Flux;

public class ReportProxy {
	
	private final WebClient.Builder webClientBuilder = WebClient.builder();
	
	public Flux<History> getCommissions(String idProduct){
		return webClientBuilder.build()
								.get()
								.uri("http://localhost:8090/history/byProductAndType/{idProduct}/{type}", idProduct, "commission")
								.retrieve()
								.bodyToFlux(History.class);
	}
	
	public Flux<Account> getAccountByClient(String idClient){
		return webClientBuilder.build()
							   .get()
							   .uri("http://localhost:8090/account/byClient/{idClient}", idClient)
							   .retrieve()
							   .bodyToFlux(Account.class);
	}
	
	public Flux<Credit> getCreditByClient(String idClient){
		return webClientBuilder.build()
							   .get()
							   .uri("http://localhost:8090/credit/allByClient/{idClient}", idClient)
							   .retrieve()
							   .bodyToFlux(Credit.class);
	}

} 
