package cg.service.impl;

import cg.model.student;
import cg.repository.IStudent;
import cg.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudent iStudent;

    @Override
    public Iterable<student> findAll() {
        return iStudent.findAll();
    }

    @Override
    public void save(student student) {
        iStudent.save(student);
    }

    @Override
    public void delete(long id) {
         iStudent.deleteById(id);
    }

    @Override
    public Optional<student> findById(long id) {
        return iStudent.findById(id);
    }
}
