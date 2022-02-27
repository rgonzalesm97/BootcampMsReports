package com.bank.report.service;

import com.bank.report.model.Account;
import com.bank.report.model.Credit;
import com.bank.report.model.History;
import com.bank.report.proxy.ReportProxy;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ReportServiceImpl implements IReportService {

    private ReportProxy reportProxy = new ReportProxy();

	@Override
	public Flux<History> getComissionsByProduct(String idProduct) {
		return reportProxy.getCommissions(idProduct);
	}

	@Override
	public Flux<Account> getAllAccountByClient(String idClient) {
		return reportProxy.getAccountByClient(idClient);
	}

	@Override
	public Flux<Credit> getAllCreditByClient(String idClient) {
		return reportProxy.getCreditByClient(idClient);
	}

}
