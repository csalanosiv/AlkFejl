
package com.mycompany.foxtrot.controllers;

import com.mycompany.foxtrot.entities.Salary;
import com.mycompany.foxtrot.entities.User;
import com.mycompany.foxtrot.entities.Worker;
import com.mycompany.foxtrot.repositories.SalaryRepository;
import com.mycompany.foxtrot.repositories.UserRepository;
import com.mycompany.foxtrot.repositories.WorkerRepository;
import com.mycompany.foxtrot.repositories.WorktimeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/workers")
public class WorkerController {
    
    @Autowired
  private WorkerRepository workerRepository;
    
    @Autowired
    private WorktimeRepository worktimeRepository;
    
    @Autowired
    private SalaryRepository salaryRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Worker>> getAll() {
        return ResponseEntity.ok(workerRepository.findAll());
    } 
    
    @GetMapping("/{id}")
    public ResponseEntity<Worker> get(@PathVariable Integer id) {
        Optional<Worker> worker = workerRepository.findById(id);
        if (worker.isPresent()) {
            return ResponseEntity.ok(worker.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<Worker> post(@RequestBody Worker worker) {
        Worker savedWorker = workerRepository.save(worker);
        return ResponseEntity.ok(savedWorker);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Worker> put(@RequestBody Worker worker, @PathVariable Integer id) {
        Optional<Worker> oWorker = workerRepository.findById(id);
        if (oWorker.isPresent()) {
            worker.setId(id);
            return ResponseEntity.ok(workerRepository.save(worker));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Worker> oWorker = workerRepository.findById(id);
        if (oWorker.isPresent()) {
            workerRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

}
