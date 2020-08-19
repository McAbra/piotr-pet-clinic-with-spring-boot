package org.piotr.petclinicwithspringboot.repositories;

import org.piotr.petclinicwithspringboot.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
