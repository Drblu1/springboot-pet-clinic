package drblu.springtraining.spingbootpetclinic.repositories;

import drblu.springtraining.spingbootpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
