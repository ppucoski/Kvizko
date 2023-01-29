package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "question_is_part_of_quiz")
public class QuestionIsPartOfQuiz {

  @Id
  private long questionid;

  @Id
  private long quizid;



}
