package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "result_table")
public class ResultTable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long resultid;

  @OneToOne
  @JoinColumn(name = "attemptid")
  private Attempt attempt;
  //private long attemptid;
  private long points;

  public ResultTable() {}
  public ResultTable(Attempt attempt, long points) {
    this.attempt = attempt;
    this.points = points;
  }
}
