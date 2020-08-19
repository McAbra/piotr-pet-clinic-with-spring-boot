package org.piotr.petclinicwithspringboot.repositories;

import org.piotr.petclinicwithspringboot.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
