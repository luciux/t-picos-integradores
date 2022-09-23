package br.edu.unochapeco.cotacao.domain.usecases;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;
import br.edu.unochapeco.cotacao.domain.providers.CotacaoDataProvider;
import br.edu.unochapeco.cotacao.domain.services.SalvarCotacaoService;

@ExtendWith(MockitoExtension.class)
public class SalvarCotacaoUseCaseTest {
    @Mock
    private CotacaoDataProvider cotacaoDataProvider;
    private SalvarCotacaoUseCase salvarCotacaoUseCase;
    CotacaoEntity cotacao;

    @BeforeEach
    public void setup() {
        cotacao = new CotacaoEntity();
        cotacao.setId(1);
        cotacao.setEndereco("Rua 1");
        cotacao.setSolicitante("Luciano");
        cotacao.setValor(null);
        cotacao.setStatus("P");

        salvarCotacaoUseCase = new SalvarCotacaoService(cotacaoDataProvider);
    }

    @Test
    public void deveRetornarVerdadeiroQuandoSalvarCotacao() {
        Mockito.when(cotacaoDataProvider.salvarCotacao(cotacao)).thenReturn(true);
        assertTrue(salvarCotacaoUseCase.execute(cotacao));
    }

    @Test
    public void deveRetornarFalsoQuandoSalvarCotacao() {
        Mockito.when(cotacaoDataProvider.salvarCotacao(cotacao)).thenReturn(false);
        assertFalse(salvarCotacaoUseCase.execute(cotacao));
    }
}
