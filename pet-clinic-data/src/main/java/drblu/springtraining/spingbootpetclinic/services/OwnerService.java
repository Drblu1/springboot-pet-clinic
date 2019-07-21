package drblu.springtraining.spingbootpetclinic.services;

import drblu.springtraining.spingbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
