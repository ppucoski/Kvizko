package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {

  @Id
  private long subjectid;
  private String subjectname;


  public long getSubjectid() {
    return subjectid;
  }

  public void setSubjectid(long subjectid) {
    this.subjectid = subjectid;
  }


  public String getSubjectname() {
    return subjectname;
  }

  public void setSubjectname(String subjectname) {
    this.subjectname = subjectname;
  }

}
