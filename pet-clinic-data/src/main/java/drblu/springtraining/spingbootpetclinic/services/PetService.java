package drblu.springtraining.spingbootpetclinic.services;

import drblu.springtraining.spingbootpetclinic.model.Owner;
import drblu.springtraining.spingbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
