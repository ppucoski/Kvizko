package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "izveshtajzaturniri")
@Data
public class Izveshtajzaturniri {

  @Id
  private long userid;
  private String username;
  private String tournamentname;
  private String quizname;
  private long points;
  private java.sql.Date attemptdate;
  private String medalname;


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getTournamentname() {
    return tournamentname;
  }

  public void setTournamentname(String tournamentname) {
    this.tournamentname = tournamentname;
  }


  public String getQuizname() {
    return quizname;
  }

  public void setQuizname(String quizname) {
    this.quizname = quizname;
  }


  public long getPoints() {
    return points;
  }

  public void setPoints(long points) {
    this.points = points;
  }


  public java.sql.Date getAttemptdate() {
    return attemptdate;
  }

  public void setAttemptdate(java.sql.Date attemptdate) {
    this.attemptdate = attemptdate;
  }


  public String getMedalname() {
    return medalname;
  }

  public void setMedalname(String medalname) {
    this.medalname = medalname;
  }

}
