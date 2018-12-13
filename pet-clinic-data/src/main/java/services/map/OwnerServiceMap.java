package services.map;

import model.Owner;
import services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        this.delete(object);

    }

    @Override
    public Owner findByID(Long aLong) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}
