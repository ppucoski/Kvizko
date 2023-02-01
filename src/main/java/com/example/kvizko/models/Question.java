package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="question")
public class Question {

  @Id
  private long questionid;
  private String questiontext;


}
