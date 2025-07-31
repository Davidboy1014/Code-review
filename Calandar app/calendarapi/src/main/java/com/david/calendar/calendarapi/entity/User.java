package com.david.calendar.calendarapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    String Name;
    private String firstName;
    private String lastName;
    private String email;
    private String Password;

    //Initatlizer for the user
    public User(){
    }
    public User(String firstName, String lastName, String email, String Password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.Password = Password;
    }
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }


    //Getter and Setter for firstName name
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //Getter and Setter for lastName name
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    //Getter and Setter for email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.firstName = email;
    }

    //Getter and Setter for Password
    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.firstName = Password;
    }

    
}
