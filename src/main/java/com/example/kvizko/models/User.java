package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Data
@Table(name = "user_table")
public class User implements UserDetails {

  @Id
  private long userid;
  private String fullname;
  private String username;
  private String passwordAttr;

  private boolean isAccountNonExpired = true;
  private boolean isAccountNonLocked = true;
  private boolean isCredentialsNonExpired = true;
  private boolean isEnabled = true;



  public User(String fullname, String username, String passwordAttr) {
    this.fullname = fullname;
    this.username = username;
    this.passwordAttr = passwordAttr;
  }
  public User(){}

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return null;
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }
}
