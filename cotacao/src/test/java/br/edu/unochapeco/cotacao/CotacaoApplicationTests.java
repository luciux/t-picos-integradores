package br.edu.unochapeco.cotacao;

import java.io.Console;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;
import br.edu.unochapeco.cotacao.domain.usecases.BuscarCotacoesUseCase;
import br.edu.unochapeco.cotacao.domain.usecases.SalvarCotacaoUseCase;

@SpringBootTest
class CotacaoApplicationTests {
	@Autowired
	private SalvarCotacaoUseCase salvarCotacaoUseCase;
	@Autowired
	private BuscarCotacoesUseCase buscarCotacoesUseCase;

	@Test
	void contextLoads() {
	}

	void salvarCotacao1() {
		CotacaoEntity cotacao = new CotacaoEntity();
		cotacao.setId(1);
		cotacao.setEndereco("Rua 1");
		cotacao.setSolicitante("Luciano");
		cotacao.setValor(null);
		cotacao.setStatus("P");
		System.out.println(salvarCotacaoUseCase.execute(cotacao));
	}

	void salvarCotacao2() {
		CotacaoEntity cotacao = new CotacaoEntity();
		cotacao.setId(2);
		cotacao.setEndereco("Rua 2");
		cotacao.setSolicitante("Radames");
		cotacao.setValor(null);
		cotacao.setStatus("P");
		System.out.println(salvarCotacaoUseCase.execute(cotacao));
	}

	@Test
	void buscarCotacoes() {
		salvarCotacao1();
		salvarCotacao2();
		System.out.println(buscarCotacoesUseCase.execute());
	}

}
