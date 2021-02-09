package by.jrr.fp.nbrbclient.client;

import by.jrr.fp.nbrbclient.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NbRbClient {

    @Autowired
    RestTemplate restTemplate;

//    @Value("${nbrb.uri}")
    String uri = "http://www.nbrb.by/api/exrates/rates/usd?parammode={parammode}";

    public ResponseEntity<String> getCurrency() {
        return restTemplate.getForEntity(uri, String.class, "2");
    }
}
