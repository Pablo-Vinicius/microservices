package br.cesed.lsi.unifacisa.Carrinho;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carrinho", path = "carrinho")
public interface CarrinhoRepository extends CrudRepository<Carrinho, Integer> {

}
