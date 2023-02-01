package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "selectionquestion")
public class Selectionquestion {

  @Id
  private long questionid;

  @OneToMany(mappedBy = "selectionquestion")
  private List<Choice> choices; //ova mozhe da se iskoristi za ponatamu


}
