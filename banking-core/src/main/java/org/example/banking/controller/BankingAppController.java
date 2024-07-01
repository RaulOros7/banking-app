package org.example.banking.controller;

import org.example.currencyexchange.CurrencyExchange;
import org.example.currencyexchange.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankingAppController {

    @Autowired
    private CurrencyExchangeService exchangeService;
    @PostMapping()
    public double exchange(@RequestBody CurrencyExchange currencyExchange)
    {
        System.out.println(exchangeService.exchange(currencyExchange));
        return exchangeService.exchange(currencyExchange);
    }


}
