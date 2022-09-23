package br.edu.transpotadora.cotacao.domain.usecases;

import br.edu.transpotadora.cotacao.domain.entities.CotacaoEntity;

public interface BuscaCotacaoUseCase {

    public Boolean execute(CotacaoEntity cotacao);

}
