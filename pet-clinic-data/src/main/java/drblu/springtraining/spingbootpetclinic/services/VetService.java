package drblu.springtraining.spingbootpetclinic.services;

import drblu.springtraining.spingbootpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
