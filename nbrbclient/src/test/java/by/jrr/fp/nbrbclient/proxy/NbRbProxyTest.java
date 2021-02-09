package by.jrr.fp.nbrbclient.proxy;

import by.jrr.fp.nbrbclient.model.Rate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NbRbProxyTest {

    @Autowired
    NbRbProxy nbRbProxy;

    @Test
    public void getCurency() {
        String rate = nbRbProxy.getCurrency();
        System.out.println(rate);
    }

    @Test
    public void getRate() {
        Object rate = nbRbProxy.getBynToCurrencyOnDate("USD", "2016-8-6");
        System.out.println(rate);
    }
}
