package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "prashanjarangiranisporedtochniodgovori")
@Data
public class Prashanjarangiranisporedtochniodgovori {

  @Id
  private String questiontext;
  private long counter;


  public String getQuestiontext() {
    return questiontext;
  }

  public void setQuestiontext(String questiontext) {
    this.questiontext = questiontext;
  }


  public long getCounter() {
    return counter;
  }

  public void setCounter(long counter) {
    this.counter = counter;
  }

}
