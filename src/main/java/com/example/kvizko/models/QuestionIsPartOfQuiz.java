package com.example.kvizko.models;


public class QuestionIsPartOfQuiz {

  private long questionid;
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
