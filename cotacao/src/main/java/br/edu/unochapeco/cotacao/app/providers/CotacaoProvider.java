package br.edu.unochapeco.cotacao.app.providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import br.edu.unochapeco.cotacao.app.converters.CotacaoConverter;
import br.edu.unochapeco.cotacao.app.entities.CotacaoModel;
import br.edu.unochapeco.cotacao.app.repositories.CotacaoRepository;
import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;
import br.edu.unochapeco.cotacao.domain.providers.CotacaoDataProvider;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CotacaoProvider implements CotacaoDataProvider {
    private final CotacaoRepository cotacaoRepository;
    private final CotacaoConverter cotacaoConverter;

    @Override
    public Boolean salvarCotacao(CotacaoEntity cotacao) {
        try {
            cotacaoRepository.save(cotacaoConverter.convertToModel(cotacao));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public CotacaoEntity buscarCotacao(Integer id) {
        CotacaoEntity cotacaoEntity = null;
        Optional<CotacaoModel> optional = cotacaoRepository.findById(id);
        if (optional.isPresent()) {
            cotacaoEntity = cotacaoConverter.convertToEntity(optional.get());
        }
        return cotacaoEntity;
    }

    @Override
    public List<CotacaoEntity> buscarTodasAsCotacoes() {
        List<CotacaoEntity> cotacoes = new ArrayList<>();
        cotacaoRepository.findAll().forEach(cotacao -> {
            cotacoes.add(cotacaoConverter.convertToEntity(cotacao));
        });
        return cotacoes;
    }
}
