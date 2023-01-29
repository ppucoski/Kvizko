package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

import javax.xml.transform.Result;

@Entity
@Data
@Table(name="badge")
public class Badge {

  @Id
  private long badgeid;

  private String badgename;

  private String description;

  @ManyToOne
  @JoinColumn(name="resultid")
  private ResultTable result;
  //private long resultid;



}
