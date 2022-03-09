package com.example.currencyapi;


import com.example.currencyapi.rest.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CurrenciesController {

  private CurrenciesService currenciesService;

  @GetMapping(value = "/currency")
  public ModelAndView exchange(
      @RequestParam(value = "amount") String amount, String baseCurrency, String currencies) {

    Converter converter = currenciesService.getConverter(amount, baseCurrency, currencies);

    ModelAndView mv = new ModelAndView("currencies");


    return mv;
  }
}
