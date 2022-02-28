package cg.repository;


import cg.model.student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudent extends PagingAndSortingRepository<student, Long> {
}
