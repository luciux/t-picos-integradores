package br.edu.unochapeco.cotacao.domain.usecases;

import java.util.List;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;

public interface BuscarCotacoesUseCase {

    public List<CotacaoEntity> execute();
}
