package br.edu.unochapeco.cotacao.domain.services;

import org.springframework.stereotype.Service;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;
import br.edu.unochapeco.cotacao.domain.providers.CotacaoDataProvider;
import br.edu.unochapeco.cotacao.domain.usecases.BuscarCotacaoUseCase;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuscarCotacaoService implements BuscarCotacaoUseCase {
    private final CotacaoDataProvider cotacaoDataProvider;

    @Override
    public CotacaoEntity execute(Integer id) {
        return cotacaoDataProvider.buscarCotacao(id);
    }
}
