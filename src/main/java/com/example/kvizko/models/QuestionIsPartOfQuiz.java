package com.example.kvizko.models;

import com.example.kvizko.models.EmbeddedClasses.QuestionIsPartOfQuizIdClass;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "question_is_part_of_quiz")
public class QuestionIsPartOfQuiz {

  @EmbeddedId
  private QuestionIsPartOfQuizIdClass questionIsPartOfQuizIdClass;


}
