package services;

import org.piotr.petclinicwithspringboot.model.Owner;
import org.piotr.petclinicwithspringboot.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Vet findByLastName(String lastName);

    Set<Vet> findAll();
}
