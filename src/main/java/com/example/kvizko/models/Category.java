package com.example.kvizko.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="category")
public class Category {

  @Id
  private long categoryid;

  @ManyToOne
  @JoinColumn(name="subjectid")
  private Subject subject;
  //private long subjectid;

  private String categoryname;



}
