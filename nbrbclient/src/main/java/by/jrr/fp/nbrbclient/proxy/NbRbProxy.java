package by.jrr.fp.nbrbclient.proxy;

import by.jrr.fp.nbrbclient.model.Rate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "forex-service", url = "https://www.nbrb.by")
public interface NbRbProxy {
    String uri = "/api/exrates/rates/usd?parammode=2";

    @GetMapping(uri)
    String getCurrency();

    @GetMapping("/api/exrates/rates/{code}?ondate={date}&parammode=2")
    Object getBynToCurrencyOnDate(@PathVariable("code") String currencyCode, @PathVariable("date") String date);
}

