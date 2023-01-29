package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tournament")
public class Tournament {

  @Id
  private long tournamentid;
  private String tournamentname;



}
