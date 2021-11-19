package br.cesed.lsi.unifacisa.Historico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class HistoricoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoricoApplication.class, args);
	}

}
