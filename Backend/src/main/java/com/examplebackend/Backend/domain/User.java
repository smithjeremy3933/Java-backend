package com.examplebackend.Backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.Date;

@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Email(message = "Username needs to be an email")
    @NotBlank(message = "Username/Email required")
    @Column(unique = true)
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    private Date created_At;
    private Date updated_At;

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }

    public Date getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(Date updated_At) {
        this.updated_At = updated_At;
    }

    @PrePersist
    protected  void onCreate() {
        this.created_At = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At = new Date();
    }

}
