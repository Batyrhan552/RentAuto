package kg.megacom.RendAvto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("kg.megacom.RendAvto.microsercices")
@EnableDiscoveryClient
public class RendAvtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendAvtoApplication.class, args);
	}

}
