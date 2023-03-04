package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "najangazhiranikorisnici")
@Data
public class Najangazhiranikorisnici {

  @Id
  private String username;
  private long attemptedQuizzes;


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getAttemptedQuizzes() {
    return attemptedQuizzes;
  }

  public void setAttemptedQuizzes(long attemptedQuizzes) {
    this.attemptedQuizzes = attemptedQuizzes;
  }

}
