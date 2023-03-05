package com.example.kvizko.models;

import com.example.kvizko.models.EmbeddedClasses.SelectedchoiceIdClass;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "selectedchoice")
public class Selectedchoice {

  @EmbeddedId
  private SelectedchoiceIdClass selectedchoiceIdClass;

  @ManyToOne
  @JoinColumn(name = "attemptid")
  private Attempt attempt;
  //private long attemptid;

  public Selectedchoice() {}

  public Selectedchoice(Long choiceid, Attempt attempt) {
    this.attempt = attempt;
    this.selectedchoiceIdClass=new SelectedchoiceIdClass(choiceid, this.attempt.getAttemptid());
  }


}
