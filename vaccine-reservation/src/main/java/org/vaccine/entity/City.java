package org.vaccine.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity(name="city")
@Data
public class City {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String name;
  
  @OneToMany(mappedBy ="city",fetch = FetchType.LAZY )
  private List<Branch> branches;
 
}

