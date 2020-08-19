package org.piotr.petclinicwithspringboot.repositories;

import org.piotr.petclinicwithspringboot.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
