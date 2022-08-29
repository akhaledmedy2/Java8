package org.vaccine.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity(name="branch")
@Data
public class Branch {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String name;
  private String serial_no;
  private String address;
  private String telephone;
  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "city_id")
  private City city;
  
  @OneToMany(mappedBy ="branch",fetch = FetchType.LAZY )
  private List<Vaccine> vaccines;
  
}

