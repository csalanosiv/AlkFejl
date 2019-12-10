package com.mycompany.foxtrot.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Worktime {
  
  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;


  @Column
  private LocalDateTime logindate;

  @Column
  private LocalDateTime logoutdate;
  
  @Column
  private LocalDateTime breakstart;
  
  @Column
  private LocalDateTime breakfinish;
  
  @Column
  private int timecounter;
    
  
}