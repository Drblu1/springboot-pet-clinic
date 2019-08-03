package drblu.springtraining.spingbootpetclinic.services.springdatajpa;

import drblu.springtraining.spingbootpetclinic.model.Vet;
import drblu.springtraining.spingbootpetclinic.repositories.VetRepository;
import drblu.springtraining.spingbootpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springDataJpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElseThrow(() -> new RuntimeException("No Vet found for id"));
    }

    @Override
    public Set<Vet> findAll() {
        return (Set<Vet>) vetRepository.findAll();
    }

    @Override
    public Vet save(Vet entity) {
        return vetRepository.save(entity);
    }

    @Override
    public void delete(Vet entity) {
        vetRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
