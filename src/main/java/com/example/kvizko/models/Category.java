package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

  @Id
  private long categoryid;
  private long subjectid;
  private String categoryname;


  public long getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(long categoryid) {
    this.categoryid = categoryid;
  }


  public long getSubjectid() {
    return subjectid;
  }

  public void setSubjectid(long subjectid) {
    this.subjectid = subjectid;
  }


  public String getCategoryname() {
    return categoryname;
  }

  public void setCategoryname(String categoryname) {
    this.categoryname = categoryname;
  }

}
