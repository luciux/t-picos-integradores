package br.edu.unochapeco.cotacao.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unochapeco.cotacao.app.entities.CotacaoModel;

@Repository
public interface CotacaoRepository extends JpaRepository<CotacaoModel, Integer> {

}
