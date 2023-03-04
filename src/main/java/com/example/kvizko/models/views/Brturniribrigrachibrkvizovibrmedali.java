package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "brturniribrigrachibrkvizovibrmedali")
@Data
public class Brturniribrigrachibrkvizovibrmedali {

  @Id
  private String tName;
  private long totalPlayers;
  private long totalQuizzes;
  private long totalMedals;


  public String getTName() {
    return tName;
  }

  public void setTName(String tName) {
    this.tName = tName;
  }


  public long getTotalPlayers() {
    return totalPlayers;
  }

  public void setTotalPlayers(long totalPlayers) {
    this.totalPlayers = totalPlayers;
  }


  public long getTotalQuizzes() {
    return totalQuizzes;
  }

  public void setTotalQuizzes(long totalQuizzes) {
    this.totalQuizzes = totalQuizzes;
  }


  public long getTotalMedals() {
    return totalMedals;
  }

  public void setTotalMedals(long totalMedals) {
    this.totalMedals = totalMedals;
  }

}
