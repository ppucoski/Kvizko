package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Table(name="attempt")
@Data
public class Attempt {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long attemptid;

  @ManyToOne
  @JoinColumn(name="userid")
  private Quiztaker quiztaker;
  //private long userid;

  private java.sql.Date attemptdate;

  @ManyToOne
  @JoinColumn(name = "quizid")
  private Quiz quiz;
  //private long quizid;

  public Attempt() {}

  public Attempt(Quiztaker quiztaker, Date attemptdate, Quiz quiz) {
    this.quiztaker = quiztaker;
    this.attemptdate = attemptdate;
    this.quiz = quiz;
  }
}
