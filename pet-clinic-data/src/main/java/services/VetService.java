package services;

import org.piotr.petclinicwithspringboot.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);

}
