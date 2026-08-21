package br.edu.ifpe.oxefood_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxefoodApiKarolynneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiKarolynneApplication.class, args);
	}

}
