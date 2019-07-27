package drblu.springtraining.spingbootpetclinic.services.map;

import drblu.springtraining.spingbootpetclinic.model.Specialty;
import drblu.springtraining.spingbootpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialityService {
    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty entity) {
        super.delete(entity);
    }

    @Override
    public Specialty save(Specialty entity) {
        return super.save(entity);
    }
}
