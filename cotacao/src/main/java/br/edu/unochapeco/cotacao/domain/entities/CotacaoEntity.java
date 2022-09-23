package br.edu.unochapeco.cotacao.domain.entities;

import lombok.Data;

@Data
public class CotacaoEntity {
    private Integer id;
    private String endereco;
    private String status;
    private String solicitante;
    private Double valor;
}
