package br.edu.unochapeco.cotacao.domain.usecases;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;

public interface BuscarCotacaoUseCase {

    public CotacaoEntity execute(Integer id);

}
