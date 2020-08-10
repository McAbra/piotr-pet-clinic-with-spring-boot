package org.piotr.petclinicwithspringboot.services;

import org.piotr.petclinicwithspringboot.model.Vet;
import org.piotr.petclinicwithspringboot.services.CrudService;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);

}
