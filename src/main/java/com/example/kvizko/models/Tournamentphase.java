package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tournamentphase {

  @Id
  private long tournamentphaseid;
  private long tournamentid;
  private String tournamentphasename;


  public long getTournamentphaseid() {
    return tournamentphaseid;
  }

  public void setTournamentphaseid(long tournamentphaseid) {
    this.tournamentphaseid = tournamentphaseid;
  }


  public long getTournamentid() {
    return tournamentid;
  }

  public void setTournamentid(long tournamentid) {
    this.tournamentid = tournamentid;
  }


  public String getTournamentphasename() {
    return tournamentphasename;
  }

  public void setTournamentphasename(String tournamentphasename) {
    this.tournamentphasename = tournamentphasename;
  }

}
