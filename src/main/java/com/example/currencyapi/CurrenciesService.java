package com.example.currencyapi;

import com.example.currencyapi.rest.Converter;
import org.springframework.web.reactive.function.client.WebClient;

public class CurrenciesService {

  private final WebClient webClient;

  public CurrenciesService(WebClient.Builder builder){
    webClient = builder.baseUrl("https://api.currencyapi.com/v3/convert/")
        .build();
  }

  public Converter getConverter(String amount, String baseCurrency, String currencies) {
    return webClient
        .get()
        .uri(uriBuilder -> uriBuilder
            .path("/current.json")
            .queryParam("apikey", "bZibrpeXQTm3Gt9F6KuuR5cyjLkyi5shU3DamFKs")
            .queryParam("value", amount)
            .queryParam("base_currency", baseCurrency)
            .queryParam("currencies", currencies)
            .build())
        .retrieve() // Perform the HTTP request and retrieve the response body
        .bodyToMono(Converter.class)
        .block(); // returns the body as an array of User
  }
}
