package br.cesed.lsi.unifacisa.Historico;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "historico", path = "historico")
public interface HistoricoRepository extends CrudRepository<Historico, Integer> {

}
