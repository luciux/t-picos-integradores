package br.edu.unochapeco.cotacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.edu.unochapeco.cotacao")
@EnableJpaRepositories("br.edu.unochapeco.cotacao.app")
public class CotacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CotacaoApplication.class, args);
	}

}
