package org.piotr.petclinicwithspringboot.repositories;

import org.piotr.petclinicwithspringboot.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
