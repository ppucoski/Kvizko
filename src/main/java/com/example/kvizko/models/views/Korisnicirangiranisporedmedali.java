package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "korisnicirangiranisporedmedali")
@Data
public class Korisnicirangiranisporedmedali {

  @Id
  private String username;
  private long medalCount;


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getMedalCount() {
    return medalCount;
  }

  public void setMedalCount(long medalCount) {
    this.medalCount = medalCount;
  }

}
