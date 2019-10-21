package com.mycompany.foxtrot.repositories;

import com.mycompany.foxtrot.entities.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, Integer>{
    
}
