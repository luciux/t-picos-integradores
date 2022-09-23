package br.edu.unochapeco.cotacao.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;
import br.edu.unochapeco.cotacao.domain.providers.CotacaoDataProvider;
import br.edu.unochapeco.cotacao.domain.usecases.BuscarCotacoesUseCase;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BurcarCotacoesService implements BuscarCotacoesUseCase {
    private final CotacaoDataProvider cotacaoDataProvider;

    @Override
    public List<CotacaoEntity> execute() {
        return cotacaoDataProvider.buscarTodasAsCotacoes();
    }
}
