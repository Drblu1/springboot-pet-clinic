package drblu.springtraining.spingbootpetclinic.services.springdatajpa;

import drblu.springtraining.spingbootpetclinic.model.Owner;
import drblu.springtraining.spingbootpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @InjectMocks
    private OwnerSDJpaService service;

    @Mock
    private OwnerRepository ownerRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
        Owner smith = Owner.builder().id(1L).lastName("smith").build();
        when(ownerRepository.findByLastName("smith")).thenReturn(smith);

        Owner returnedOwner = service.findByLastName("smith");

        assertEquals(smith, returnedOwner);
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}