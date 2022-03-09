package com.example.currencyapi.rest;

public class Converter {

  private String baseCurrency;
  private Integer amount;
  private String desiredCurrency;
//  The currentCurrency is the one that I want to convert to
//  The amount to convert
//  The desiredCurrency is the goal currency

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public String getDesiredCurrency() {
    return desiredCurrency;
  }

  public void setDesiredCurrency(String desiredCurrency) {
    this.desiredCurrency = desiredCurrency;
  }
}
