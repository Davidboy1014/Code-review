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
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.Password = Password;
    }
    
    public long GetId(){
        return id;
    }
    public void SetId(long id){
        this.id = id;
    }


    //Getter and Setter for firstName name
    public String GetfirstName(){
        return firstName;
    }
    public void SetfirstName(String firstName){
        this.firstName = firstName;
    }

    //Getter and Setter for lastName name
    public String GetlastName(){
        return lastName;
    }
    public void SetlastName(String lastName){
        this.lastName = lastName;
    }

    //Getter and Setter for email
    public String Getemail(){
        return email;
    }
    public void Setemail(String email){
        this.firstName = email;
    }

    //Getter and Setter for Password
    public String GetPassword(){
        return Password;
    }
    public void SetPassword(String Password){
        this.firstName = Password;
    }

    
}
