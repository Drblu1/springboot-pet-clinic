package drblu.springtraining.spingbootpetclinic.services.springdatajpa;

import drblu.springtraining.spingbootpetclinic.model.Specialty;
import drblu.springtraining.spingbootpetclinic.repositories.SpecialtyRepository;
import drblu.springtraining.spingbootpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springDataJpa")
public class SpecialtySDJpaService implements SpecialityService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepository.findById(id).orElseThrow(() -> new RuntimeException("no specialty found for this id " + id));
    }

    @Override
    public Set<Specialty> findAll() {
        return (Set<Specialty>) specialtyRepository.findAll();
    }

    @Override
    public Specialty save(Specialty entity) {
        return specialtyRepository.save(entity);
    }

    @Override
    public void delete(Specialty entity) {
        specialtyRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
