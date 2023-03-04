package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "najigranikvizovi")
@Data
public class Najigranikvizovi {

  @Id
  private String quizname;
  private long count;


  public String getQuizname() {
    return quizname;
  }

  public void setQuizname(String quizname) {
    this.quizname = quizname;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

}
