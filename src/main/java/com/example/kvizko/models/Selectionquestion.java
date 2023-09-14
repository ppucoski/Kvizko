package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;

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
