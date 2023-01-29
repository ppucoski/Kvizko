package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="medal")
public class Medal {

  @Id
  private long medalid;

  @ManyToOne
  @JoinColumn(name="tournamentid")
  private Tournament tournament;
  //private long tournamentid;
  private String medalname;
  private String description;



}
