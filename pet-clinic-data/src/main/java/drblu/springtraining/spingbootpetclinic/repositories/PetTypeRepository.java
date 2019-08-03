package drblu.springtraining.spingbootpetclinic.repositories;

import drblu.springtraining.spingbootpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
