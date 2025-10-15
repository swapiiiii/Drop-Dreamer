package com.dropdreamer.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long srNo;

    private String userName;

    public User() {}

    public User(String userName) {
        this.userName = userName;
    }

    // getters and setters
    public Long getSrNo() { return srNo; }
    public void setSrNo(Long srNo) { this.srNo = srNo; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
}