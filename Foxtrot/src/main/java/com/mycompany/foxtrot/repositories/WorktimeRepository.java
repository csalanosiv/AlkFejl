
package com.mycompany.foxtrot.repositories;

import com.mycompany.foxtrot.entities.Worktime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorktimeRepository extends CrudRepository<Worktime, Integer> {

}
