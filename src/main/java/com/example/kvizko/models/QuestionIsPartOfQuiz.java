package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class QuestionIsPartOfQuiz {

  @Id
  private long questionid;

  @Id
  private long quizid;


  public long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(long questionid) {
    this.questionid = questionid;
  }


  public long getQuizid() {
    return quizid;
  }

  public void setQuizid(long quizid) {
    this.quizid = quizid;
  }

}
