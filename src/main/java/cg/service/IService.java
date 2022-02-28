package cg.service;

import java.util.Optional;

public interface IService <E>{
    Iterable<E> findAll();

    void save(E e);
    void delete(long id);
    Optional<E> findById(long id);
}
