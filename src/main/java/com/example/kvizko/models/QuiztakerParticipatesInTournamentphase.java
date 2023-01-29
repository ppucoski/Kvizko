package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "quiztaker_participates_in_tournamentphase")
public class QuiztakerParticipatesInTournamentphase {

  @Id
  private long userid;

  @Id
  private long tournamentphaseid;



}
