package drblu.springtraining.spingbootpetclinic.services.map;

import drblu.springtraining.spingbootpetclinic.model.Owner;
import drblu.springtraining.spingbootpetclinic.services.PetService;
import drblu.springtraining.spingbootpetclinic.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

class OwnerMapServiceTest {

    private OwnerMapService ownerMapService;

    private final Long ownerId = 1L;

    private String john = "john";

    private Owner savedOwner = Owner.builder().id(ownerId).lastName(john).build();

    @Mock
    private PetTypeService petTypeService;

    @Mock
    private PetService petService;

    @BeforeEach
    void setUp() {
        initMocks(this);

        ownerMapService = new OwnerMapService(petTypeService, petService);

        ownerMapService.save(savedOwner);
    }

    @Test
    void findById() {

        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(savedOwner, owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();

        assertTrue(owners.contains(savedOwner));
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(savedOwner);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {

        Owner john = ownerMapService.findByLastName(this.john);

        assertEquals(savedOwner, john);

    }
}