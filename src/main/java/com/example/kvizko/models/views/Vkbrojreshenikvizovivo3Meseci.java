package com.example.kvizko.models.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "vkbrojreshenikvizovivo3meseci")
@Data
public class Vkbrojreshenikvizovivo3Meseci {

  @Id
  private long brojResheniKvizovi;


  public long getBrojResheniKvizovi() {
    return brojResheniKvizovi;
  }

  public void setBrojResheniKvizovi(long brojResheniKvizovi) {
    this.brojResheniKvizovi = brojResheniKvizovi;
  }

}
