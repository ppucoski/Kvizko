package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tournamentphase")
public class Tournamentphase {

  @Id
  private long tournamentphaseid;

  @ManyToOne
  @JoinColumn(name = "tournamentid")
  private Tournament tournament;
  //private long tournamentid;
  private String tournamentphasename;



}
