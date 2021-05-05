package br.com.felipeomachado.desafio1.repositories;

import br.com.felipeomachado.desafio1.entities.Modulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloRepository extends CrudRepository<Modulo, Integer> {
}
