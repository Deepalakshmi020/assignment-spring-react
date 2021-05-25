package com.example.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "users")
public class User {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
	  
	  @Column(name = "first_name")
      private String fName;
	  @Column(name = "last_name")
      private String lName;
      private String email;
      private String location;
      public User(){
    	  
      }
      
    public User(String fName, String lName, String email, String location) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}      
}
