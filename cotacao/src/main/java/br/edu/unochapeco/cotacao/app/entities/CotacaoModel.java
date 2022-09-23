package br.edu.unochapeco.cotacao.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COTACOES")
@Getter
@Setter
public class CotacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ENDERECO", nullable = false)
    private String endereco;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "SOLICITANTE", nullable = false)
    private String solicitante;

    @Column(name = "VALOR", nullable = true)
    private Double valor;
}
