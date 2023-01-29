package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class QuizIsPartOfTournamentphase {

  @Id
  private long quizid;

  @Id
  private long tournamentphaseid;


  public long getQuizid() {
    return quizid;
  }

  public void setQuizid(long quizid) {
    this.quizid = quizid;
  }


  public long getTournamentphaseid() {
    return tournamentphaseid;
  }

  public void setTournamentphaseid(long tournamentphaseid) {
    this.tournamentphaseid = tournamentphaseid;
  }

}
