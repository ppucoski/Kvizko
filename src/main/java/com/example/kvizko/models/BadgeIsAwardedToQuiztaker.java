package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="badge_is_awarded_to_quiztaker")
@Data
public class BadgeIsAwardedToQuiztaker {

  @Id
  private long badgeid;

  @Id
  private long userid;

}
