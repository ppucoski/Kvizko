package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="attempt")
@Data
public class Attempt {

  @Id
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




}
