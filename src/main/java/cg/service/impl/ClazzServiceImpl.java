package cg.service.impl;

import cg.model.clazz;
import cg.repository.IClazz;
import cg.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClazzServiceImpl implements IClazzService {
    @Autowired
    private IClazz iClazz;

    @Override
    public Iterable<clazz> findAll() {
        return iClazz.findAll();
    }

    @Override
    public void save(clazz clazz) {
        Optional.empty();
    }

    @Override
    public void delete(long id) {
        Optional.empty();
    }

    @Override
    public Optional<clazz> findById(long id) {
        return iClazz.findById(id);
    }
}
