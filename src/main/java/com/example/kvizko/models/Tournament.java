package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tournament {

  @Id
  private long tournamentid;
  private String tournamentname;


  public long getTournamentid() {
    return tournamentid;
  }

  public void setTournamentid(long tournamentid) {
    this.tournamentid = tournamentid;
  }


  public String getTournamentname() {
    return tournamentname;
  }

  public void setTournamentname(String tournamentname) {
    this.tournamentname = tournamentname;
  }

}
