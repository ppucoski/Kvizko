package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class QuizIsPartOfTournament {

  @Id
  private long quizid;

  @Id
  private long tournamentid;


  public long getQuizid() {
    return quizid;
  }

  public void setQuizid(long quizid) {
    this.quizid = quizid;
  }


  public long getTournamentid() {
    return tournamentid;
  }

  public void setTournamentid(long tournamentid) {
    this.tournamentid = tournamentid;
  }

}
