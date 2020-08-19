package org.piotr.petclinicwithspringboot.repositories;

import org.piotr.petclinicwithspringboot.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
