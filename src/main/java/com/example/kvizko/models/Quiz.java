package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="quiz")
public class Quiz {

  @Id
  private long quizid;

  @ManyToOne
  @JoinColumn(name = "categoryid")
  private Category category;
  //private long categoryid;
  private String quizname;



}
