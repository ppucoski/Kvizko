package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "medal_is_awarded_to_quiztaker")
public class MedalIsAwardedToQuiztaker {

  @Id
  private long medalid;

  @Id
  private long userid;



}
