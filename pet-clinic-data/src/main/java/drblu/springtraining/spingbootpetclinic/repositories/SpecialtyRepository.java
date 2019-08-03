package drblu.springtraining.spingbootpetclinic.repositories;

import drblu.springtraining.spingbootpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
