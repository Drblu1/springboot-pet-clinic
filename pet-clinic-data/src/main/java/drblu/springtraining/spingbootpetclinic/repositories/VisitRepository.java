package drblu.springtraining.spingbootpetclinic.repositories;

import drblu.springtraining.spingbootpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
