package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "quiz_is_part_of_tournament")
public class QuizIsPartOfTournament {

  @Id
  private long quizid;

  @Id
  private long tournamentid;



}
