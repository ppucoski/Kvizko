package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="hint")
public class Hint {

  @Id
  private long hintid;
  private String hinttext;

  @OneToOne
  @JoinColumn(name="questionid")
  private Question question;
  /*private long questionid;*/




}
