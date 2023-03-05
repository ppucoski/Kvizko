package com.example.kvizko.models.views;

import com.example.kvizko.models.EmbeddedClasses.Top5ReshavachiIdClass;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "top5reshavachi")
@Data
public class Top5Reshavachi {

  @EmbeddedId
  private Top5ReshavachiIdClass top5ReshavachiIdClass;

  private long points;



  public String getUsername() {
    return top5ReshavachiIdClass.getUsername();
  }

  /*public void setUsername(String username) {
    this.username = username;
  }*/


  public long getPoints() {
    return points;
  }

  public void setPoints(long points) {
    this.points = points;
  }


  public String getQuizname() {
    return top5ReshavachiIdClass.getQuizname();
  }

/*  public void setQuizname(String quizname) {
    this.quizname = quizname;
  }*/

}
