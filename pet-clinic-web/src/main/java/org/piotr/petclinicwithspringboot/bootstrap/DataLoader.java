package org.piotr.petclinicwithspringboot.bootstrap;

import org.piotr.petclinicwithspringboot.model.*;
import org.piotr.petclinicwithspringboot.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtiesService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtiesService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtiesService = specialtiesService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Specialty radiology = new Specialty();
        radiology.setDescription("radiology");
        Specialty surgery = new Specialty();
        surgery.setDescription("surgery");
        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedSurgery = specialtiesService.save(surgery);
        Specialty savedRadiology = specialtiesService.save(radiology);
        Specialty savedDentistry = specialtiesService.save(dentistry);

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Janusz");
        owner1.setLastName("Gajos");
        owner1.setAddress("Piotrkowska 1");
        owner1.setCity("Kaszanka");
        owner1.setPhone("125 125 147");

        Pet jPet = new Pet();
        jPet.setPetType(savedDogPetType);
        jPet.setName("Azor");
        jPet.setOwner(owner1);
        jPet.setBirthDate(LocalDate.of(2015, 11, 10));
        owner1.getPets().add(jPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kondrad");
        owner2.setLastName("Skonieczny");
        owner2.setAddress("Warszawska 8");
        owner2.setCity("Kielce");
        owner2.setPhone("879 879 987");

        Pet kPet = new Pet();
        kPet.setPetType(savedCatPetType);
        kPet.setName("Mruk");
        kPet.setOwner(owner2);
        kPet.setBirthDate(LocalDate.of(2010, 11, 10));
        owner2.getPets().add(kPet);

        ownerService.save(owner2);

        Visit kPetVisit = new Visit();
        kPetVisit.setPet(kPet);
        kPetVisit.setDate(LocalDate.now());
        kPetVisit.setDescription("coughing cat");
        visitService.save(kPetVisit);

        System.out.println("Owners Loaded!....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Zenon");
        vet1.setLastName("Jaskóła");
        vet1.setSpecialty(savedDentistry);
        vet1.setSpecialty(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Michał");
        vet2.setLastName("Grigorov");
        vet2.setSpecialty(savedSurgery);

        vetService.save(vet2);

        System.out.println("Vets Loaded!....");
    }
}
