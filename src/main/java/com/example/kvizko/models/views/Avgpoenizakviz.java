package com.example.kvizko.models.views;

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

  @Id
  private long userid;
  private String quizname;
  private BigDecimal avg;


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getQuizname() {
    return quizname;
  }

  public void setQuizname(String quizname) {
    this.quizname = quizname;
  }


  public BigDecimal getAvg() {
    return avg;
  }

  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

}
