package com.kevvlvl.customannotation.model;

import com.kevvlvl.customannotation.annotation.Fund;
import com.kevvlvl.customannotation.annotation.Symbol;

import java.math.BigDecimal;

@Fund(type = "eft")
public class FinanceData {

    private String stockSymbol;
    private BigDecimal value;

    public FinanceData(String stockSymbol, BigDecimal value) {
        this.stockSymbol = stockSymbol;
        this.value = value;
    }

    @Symbol(upper = true)
    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FinanceData{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", value=" + value +
                '}';
    }
}
