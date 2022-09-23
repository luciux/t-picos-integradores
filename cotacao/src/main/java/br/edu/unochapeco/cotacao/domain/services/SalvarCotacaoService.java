package br.edu.unochapeco.cotacao.domain.services;

import org.springframework.stereotype.Service;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;
import br.edu.unochapeco.cotacao.domain.providers.CotacaoDataProvider;
import br.edu.unochapeco.cotacao.domain.usecases.SalvarCotacaoUseCase;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SalvarCotacaoService implements SalvarCotacaoUseCase {
    private final CotacaoDataProvider cotacaoDataProvider;

    @Override
    public Boolean execute(CotacaoEntity cotacao) {
        return cotacaoDataProvider.salvarCotacao(cotacao);
    }
}
