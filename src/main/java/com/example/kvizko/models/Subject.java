package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "subject")
public class Subject {

  @Id
  private long subjectid;
  private String subjectname;



}
