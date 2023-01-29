package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class QuiztakerParticipatesInTournamentphase {

  @Id
  private long userid;

  @Id
  private long tournamentphaseid;


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getTournamentphaseid() {
    return tournamentphaseid;
  }

  public void setTournamentphaseid(long tournamentphaseid) {
    this.tournamentphaseid = tournamentphaseid;
  }

}
