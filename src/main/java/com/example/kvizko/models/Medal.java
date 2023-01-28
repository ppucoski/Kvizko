package com.example.kvizko.models;


public class Medal {

  private long medalid;
  private long tournamentid;
  private String medalname;
  private String description;


  public long getMedalid() {
    return medalid;
  }

  public void setMedalid(long medalid) {
    this.medalid = medalid;
  }


  public long getTournamentid() {
    return tournamentid;
  }

  public void setTournamentid(long tournamentid) {
    this.tournamentid = tournamentid;
  }


  public String getMedalname() {
    return medalname;
  }

  public void setMedalname(String medalname) {
    this.medalname = medalname;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
