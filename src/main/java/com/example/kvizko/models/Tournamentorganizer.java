package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tournamentorganizer {

  @Id
  private long userid;

  @Id
  private long tournamentorganizerid;


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getTournamentorganizerid() {
    return tournamentorganizerid;
  }

  public void setTournamentorganizerid(long tournamentorganizerid) {
    this.tournamentorganizerid = tournamentorganizerid;
  }

}
