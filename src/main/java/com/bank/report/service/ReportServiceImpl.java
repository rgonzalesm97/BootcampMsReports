package com.bank.report.service;

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

}
