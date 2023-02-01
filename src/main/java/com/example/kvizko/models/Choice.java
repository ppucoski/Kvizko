package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "choice")
public class Choice {

  @Id
  private long choiceid;

  @ManyToOne
  @JoinColumn(name="questionid")
  private Selectionquestion selectionquestion;

  //private long questionid;
  private boolean iscorrect;
  private String choicetext;


}
