package com.david.calendar.calendarapi.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    String Name;
    private String First;
    private String Last;
    private String Email;
    private String Password;

    //Initatlizer for the user
    public User(){
    }
    public User(String First, String Last, String Email, String Password){
        this.id = id;
        this.First = First;
        this.Last = Last;
        this.Email = Email;
        this.Password = Password;
    }
    
    //Getter and Setter for First name
    public String GetFirst(){
        return First;
    }
    public void SetFirst(String First){
        this.First = First;
    }

    //Getter and Setter for Last name
    public String GetLast(){
        return Last;
    }
    public void SetLast(String Last){
        this.First = Last;
    }

    //Getter and Setter for Email
    public String GetEmail(){
        return Email;
    }
    public void SetEmail(String Email){
        this.First = Email;
    }

    //Getter and Setter for Password
    public String GetPassword(){
        return Password;
    }
    public void SetPassword(String Password){
        this.First = Password;
    }

    
}
