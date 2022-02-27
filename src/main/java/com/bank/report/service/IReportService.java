package com.bank.report.service;

import com.bank.report.model.Account;
import com.bank.report.model.Credit;
import com.bank.report.model.History;

import reactor.core.publisher.Flux;


public interface IReportService {

    Flux<History> getComissionsByProduct(String idProduct);
    Flux<Account> getAllAccountByClient(String idClient);
    Flux<Credit> getAllCreditByClient(String idClient);
}
