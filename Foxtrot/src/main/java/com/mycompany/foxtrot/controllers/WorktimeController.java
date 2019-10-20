
package com.mycompany.foxtrot.controllers;

import com.mycompany.foxtrot.entities.Salary;
import com.mycompany.foxtrot.entities.User;
import com.mycompany.foxtrot.entities.Worktime;
import com.mycompany.foxtrot.repositories.UserRepository;
import com.mycompany.foxtrot.repositories.WorktimeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worktimes")
public class WorktimeController {
    
    @Autowired
    private WorktimeRepository worktimeRepository;
 
    @GetMapping("")
    public ResponseEntity<Iterable<Worktime>> getAll() {
        return ResponseEntity.ok(worktimeRepository.findAll());
    }
    
    
    
}