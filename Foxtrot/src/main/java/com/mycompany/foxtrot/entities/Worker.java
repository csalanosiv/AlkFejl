package com.mycompany.foxtrot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Worker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column(updatable = false)
    private LocalDateTime date_of_birth;

    @Column(updatable = false)
    private String place_of_birth;
    
    @Column (updatable = false)
    private String mothers_name;
	
    @Column 
    private String bank_account_number;
	
    @Column 
    private String position;
	
    @Column
    private int bonus;
    
    @ManyToOne
    @JoinColumn
    private Salary salary;
    
    @OneToOne
    @JoinColumn
    private User user;
}
