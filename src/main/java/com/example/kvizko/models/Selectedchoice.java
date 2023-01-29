package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "selectedchoice")
public class Selectedchoice {

  @Id
  private long selectedchoiceid;

  @Id
  private long choiceid;

  @ManyToOne
  @JoinColumn(name = "attemptid")
  private Attempt attempt;
  //private long attemptid;



}
