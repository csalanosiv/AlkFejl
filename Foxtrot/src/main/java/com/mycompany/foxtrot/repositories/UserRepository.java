
package com.mycompany.foxtrot.repositories;

import com.mycompany.foxtrot.entities.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
   public Optional<User> findByUsername(String username);
}
