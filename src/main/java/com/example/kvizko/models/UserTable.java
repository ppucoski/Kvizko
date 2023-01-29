package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user_table")
public class UserTable {

  @Id
  private long userid;
  private String fullname;
  private String username;
  private String passwordAttr;



}
