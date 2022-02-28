package cg.repository;

import cg.model.clazz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClazz extends CrudRepository<clazz,Long> {

}
