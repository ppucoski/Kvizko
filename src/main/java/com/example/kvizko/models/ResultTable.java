package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ResultTable {

  @Id
  private long resultid;
  private long attemptid;
  private long points;


  public long getResultid() {
    return resultid;
  }

  public void setResultid(long resultid) {
    this.resultid = resultid;
  }


  public long getAttemptid() {
    return attemptid;
  }

  public void setAttemptid(long attemptid) {
    this.attemptid = attemptid;
  }


  public long getPoints() {
    return points;
  }

  public void setPoints(long points) {
    this.points = points;
  }

}
