package com.bank.report.service;

import com.bank.report.model.History;

import reactor.core.publisher.Flux;


public interface IReportService {

    Flux<History> getComissionsByProduct(String idProduct);
}
