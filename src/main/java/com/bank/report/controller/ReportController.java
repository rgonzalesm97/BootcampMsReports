package com.bank.report.controller;

import com.bank.report.model.History;
import com.bank.report.service.IReportService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    IReportService service;

    @GetMapping("/commission/{idProduct}")
    public Flux<History> getCommissionsByProduct(@PathVariable("idProduct") String idProduct){
        return service.getComissionsByProduct(idProduct);
    }
    
    @GetMapping("/allProduct/{idClient}")
    public Flux<?> getAllProductByClient(@PathVariable("idClient") String idClient){
    	return Flux.concat(service.getAllAccountByClient(idClient), service.getAllCreditByClient(idClient));
    }
}
