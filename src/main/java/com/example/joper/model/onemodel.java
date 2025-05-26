package com.example.joper.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class onemodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String title;
    public onemodel(){
    }

    public onemodel(String title){
        this.title = title;
    }
    public long getid(){
        return Id;
    }
    public void setId(Long Id){
        this.Id = Id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
