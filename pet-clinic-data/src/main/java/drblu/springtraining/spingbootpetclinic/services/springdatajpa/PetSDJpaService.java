package drblu.springtraining.spingbootpetclinic.services.springdatajpa;

import drblu.springtraining.spingbootpetclinic.model.Pet;
import drblu.springtraining.spingbootpetclinic.repositories.PetRepository;
import drblu.springtraining.spingbootpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"springDataJpa"})
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElseThrow(() -> new RuntimeException("No pet found for that id" + id));
    }

    @Override
    public Set<Pet> findAll() {
        return (Set<Pet>) petRepository.findAll();
    }

    @Override
    public Pet save(Pet entity) {
        return petRepository.save(entity);
    }

    @Override
    public void delete(Pet entity) {
        petRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
