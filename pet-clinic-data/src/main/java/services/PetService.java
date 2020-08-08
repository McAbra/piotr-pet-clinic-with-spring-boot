package services;

import org.piotr.petclinicwithspringboot.model.Owner;
import org.piotr.petclinicwithspringboot.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> indAll();
}
