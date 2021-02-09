package by.jrr.fp.nbrbclient.client;

import by.jrr.fp.nbrbclient.model.Rate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NbRbClientTest {

    @Autowired
    NbRbClient nbRbClient;

    @Test
    void getCurrency() {
        ResponseEntity<String> responseEntity = nbRbClient.getCurrency();
        System.out.println(responseEntity);
    }
}
