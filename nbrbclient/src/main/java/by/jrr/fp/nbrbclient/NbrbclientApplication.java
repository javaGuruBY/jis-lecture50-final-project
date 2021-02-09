package by.jrr.fp.nbrbclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class NbrbclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbrbclientApplication.class, args);
	}

}
