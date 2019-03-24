package com.HelloWord.HelloWord.dao;

import javax.persistence.*;

@Entity
public class IssueReport {
    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String url;
    private String email;

    @ManyToOne(optional = false)
    private User user;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getEmail() {
        return email;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

