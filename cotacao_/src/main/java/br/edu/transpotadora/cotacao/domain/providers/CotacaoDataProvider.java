package br.edu.transpotadora.cotacao.domain.providers;

import java.util.List;

import br.edu.transpotadora.cotacao.domain.entities.CotacaoEntity;

public interface CotacaoDataProvider {
    public Boolean salvarCotacao(CotacaoEntity cotacao);

    public CotacaoEntity buscarCotacao(Integer id);

    public List<CotacaoEntity> buscarTodasAsCotacoes();
}
