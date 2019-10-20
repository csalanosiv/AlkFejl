
package com.mycompany.foxtrot.controllers;
import com.mycompany.foxtrot.entities.Salary;
import com.mycompany.foxtrot.repositories.SalaryRepository;
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
@RequestMapping("/salaries")
public class SalaryController {
    
    @Autowired
    private SalaryRepository salaryRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Salary>> getAll() {
        return ResponseEntity.ok(salaryRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Salary> get(@PathVariable Integer id) {
        Optional<Salary> salary = salaryRepository.findById(id);
        if (salary.isPresent()) {
            return ResponseEntity.ok(salary.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<Salary> post(@RequestBody Salary salary) {
        Salary savedSalary = salaryRepository.save(salary);
        return ResponseEntity.ok(savedSalary);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Salary> put(@RequestBody Salary salary, @PathVariable Integer id) {
        Optional<Salary> oSalary = salaryRepository.findById(id);
        if (oSalary.isPresent()) {
            salary.setId(id);
            return ResponseEntity.ok(salaryRepository.save(salary));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Salary> oLabel = salaryRepository.findById(id);
        if (oLabel.isPresent()) {
            salaryRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
