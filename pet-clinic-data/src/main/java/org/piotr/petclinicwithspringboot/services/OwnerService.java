package org.piotr.petclinicwithspringboot.services;

import org.piotr.petclinicwithspringboot.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {


    Owner findByLastName(String lastName);


}
