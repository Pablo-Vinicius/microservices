package br.cesed.lsi.unifacisa.Pedido;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pedido", path = "pedido")
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}
