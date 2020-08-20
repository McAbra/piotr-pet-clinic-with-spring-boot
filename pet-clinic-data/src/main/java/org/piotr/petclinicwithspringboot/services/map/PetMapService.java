package org.piotr.petclinicwithspringboot.services.map;

import org.piotr.petclinicwithspringboot.model.Pet;
import org.piotr.petclinicwithspringboot.services.PetService;
import org.springframework.stereotype.Service;


import java.util.Set;
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
