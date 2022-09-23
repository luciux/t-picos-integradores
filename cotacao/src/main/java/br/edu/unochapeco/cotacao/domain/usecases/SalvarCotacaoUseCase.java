package br.edu.unochapeco.cotacao.domain.usecases;

import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;

public interface SalvarCotacaoUseCase {

    public Boolean execute(CotacaoEntity cotacao);
}
