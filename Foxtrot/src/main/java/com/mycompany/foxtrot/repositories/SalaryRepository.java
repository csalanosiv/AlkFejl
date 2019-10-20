package com.mycompany.foxtrot.repositories;

import com.mycompany.foxtrot.entities.Salary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, Integer> {
    
}