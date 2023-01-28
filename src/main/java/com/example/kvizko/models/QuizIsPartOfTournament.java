package com.example.kvizko.models;


public class QuizIsPartOfTournament {

  private long quizid;
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
