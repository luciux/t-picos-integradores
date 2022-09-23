package br.edu.unochapeco.cotacao.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import br.edu.unochapeco.cotacao.app.converters.BaseConverter;
import br.edu.unochapeco.cotacao.app.converters.CotacaoConverter;
import br.edu.unochapeco.cotacao.app.entities.CotacaoModel;
import br.edu.unochapeco.cotacao.domain.entities.CotacaoEntity;

@ExtendWith(MockitoExtension.class)
public class CotacaoConverterTest {
    BaseConverter<CotacaoModel, CotacaoEntity> converter = new CotacaoConverter();

    @Test
    public void converterEntityParaModel() {
        CotacaoEntity entity = new CotacaoEntity();
        entity.setId(1);
        entity.setEndereco("Rua 1");
        entity.setSolicitante("Luciano");
        entity.setValor(null);
        entity.setStatus("P");

        CotacaoModel model = converter.convertToModel(entity);

        assert (model.getId() == 1);
        assert (model.getEndereco().equals("Rua 1"));
        assert (model.getSolicitante().equals("Luciano"));
        assert (model.getValor() == null);
        assert (model.getStatus().equals("P"));
    }

    @Test
    public void converterModelParaEntity() {
        CotacaoModel model = new CotacaoModel();
        model.setId(1);
        model.setEndereco("Rua 1");
        model.setSolicitante("Luciano");
        model.setValor(null);
        model.setStatus("P");

        CotacaoEntity entity = converter.convertToEntity(model);

        assert (entity.getId() == 1);
        assert (entity.getEndereco().equals("Rua 1"));
        assert (entity.getSolicitante().equals("Luciano"));
        assert (entity.getValor() == null);
        assert (entity.getStatus().equals("P"));
    }
}
