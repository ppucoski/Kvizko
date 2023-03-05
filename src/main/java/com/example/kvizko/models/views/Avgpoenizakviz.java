package com.example.kvizko.models.views;

import com.example.kvizko.models.EmbeddedClasses.AvgpoenizakvizIdClass;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

@Immutable
@Entity
@Table(name = "avgpoenizakviz")
@Data
public class Avgpoenizakviz {

  @EmbeddedId
  private AvgpoenizakvizIdClass avgpoenizakvizIdClass;
  private BigDecimal avg;


  public String getUsername() {
    return avgpoenizakvizIdClass.getUsername();
  }

  /*public void setUsername(String username) {
    this.username = username;
  }*/


  public String getQuizname() {
    return avgpoenizakvizIdClass.getQuizname();
  }

  /*public void setQuizname(String quizname) {
    this.quizname = quizname;
  }*/


  public BigDecimal getAvg() {
    return avg;
  }

  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

}
