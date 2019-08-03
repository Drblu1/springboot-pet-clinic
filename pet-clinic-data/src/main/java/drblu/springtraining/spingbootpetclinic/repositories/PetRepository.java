package drblu.springtraining.spingbootpetclinic.repositories;

import drblu.springtraining.spingbootpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
