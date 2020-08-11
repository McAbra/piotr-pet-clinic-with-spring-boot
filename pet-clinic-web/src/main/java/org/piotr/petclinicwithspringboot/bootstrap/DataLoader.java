package org.piotr.petclinicwithspringboot.bootstrap;

import org.piotr.petclinicwithspringboot.model.Owner;
import org.piotr.petclinicwithspringboot.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.piotr.petclinicwithspringboot.services.OwnerService;
import org.piotr.petclinicwithspringboot.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Janusz");
        owner1.setLastName("Gajos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kondrad");
        owner2.setLastName("Skonieczny");

        ownerService.save(owner2);

        System.out.println("Owners Loaded!....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Zenon");
        vet1.setLastName("Jaskóła");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Michał");
        vet2.setLastName("Grigorov");

        vetService.save(vet2);

        System.out.println("Vets Loaded!....");
    }
}
