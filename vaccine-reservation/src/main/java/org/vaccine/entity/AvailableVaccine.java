package org.vaccine.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity(name="availablevaccine")
@Data
public class AvailableVaccine {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private Integer availability;
  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "branch_id")
  private Branch branch;
  
}

