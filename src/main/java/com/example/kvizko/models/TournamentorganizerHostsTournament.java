package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tournamentorganizer_hosts_tournament")
public class TournamentorganizerHostsTournament {

  @Id
  private long userid;

  @Id
  private long tournamentid;



}
