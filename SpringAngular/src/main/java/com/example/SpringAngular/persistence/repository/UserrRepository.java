package com.example.SpringAngular.persistence.repository;

import com.example.SpringAngular.persistence.model.Userr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserrRepository extends CrudRepository<Userr, Long> {
}
