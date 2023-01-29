package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="quiz_is_part_of_tournamentphase")
public class QuizIsPartOfTournamentphase {

  @Id
  private long quizid;

  @Id
  private long tournamentphaseid;



}
