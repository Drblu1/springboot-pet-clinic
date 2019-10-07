package drblu.springtraining.spingbootpetclinic.services;

import drblu.springtraining.spingbootpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastMane);

}
