package br.edu.unochapeco.cotacao.app.converters;

import org.springframework.stereotype.Component;

import br.edu.unochapeco.cotacao.app.entities.CotacaoModel;
import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;

@Component
public class CotacaoConverter implements BaseConverter<CotacaoModel, CotacaoEntity> {

    @Override
    public CotacaoModel convertToModel(CotacaoEntity entity) {
        CotacaoModel model = new CotacaoModel();
        model.setId(entity.getId());
        model.setEndereco(entity.getEndereco());
        model.setStatus(entity.getStatus());
        model.setSolicitante(entity.getSolicitante());
        model.setValor(entity.getValor());
        return model;
    }

    @Override
    public CotacaoEntity convertToEntity(CotacaoModel model) {
        CotacaoEntity entity = new CotacaoEntity();
        entity.setId(model.getId());
        entity.setEndereco(model.getEndereco());
        entity.setStatus(model.getStatus());
        entity.setSolicitante(model.getSolicitante());
        entity.setValor(model.getValor());
        return entity;
    }
}
