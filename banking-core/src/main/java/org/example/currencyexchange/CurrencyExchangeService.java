package org.example.currencyexchange;

import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    public double exchange(CurrencyExchange currencyExchange)
    {

        double exchangeRate = getExchangeRate(currencyExchange.getFromCurrency(), currencyExchange.getToCurrency());
        double amountAfterExchange = currencyExchange.getAmount() * exchangeRate;
        double amountTva = amountAfterExchange + (amountAfterExchange * currencyExchange.getTva() / 100);
        return amountTva;
    }

    public double getExchangeRate(String fromCurrency, String toCurrency)
    {
        if (fromCurrency.equals("RON") && toCurrency.equals("EUR")) {
            return 0.20;
        }

        if (fromCurrency.equals("EUR") && toCurrency.equals("RON")) {
            return 4.9;
        }

        return 1.0;
    }
}
