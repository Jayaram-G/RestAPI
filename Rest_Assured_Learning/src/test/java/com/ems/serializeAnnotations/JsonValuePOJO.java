package com.ems.serializeAnnotations;

import com.fasterxml.jackson.annotation.JsonValue;

public class JsonValuePOJO {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonValue
	public String useThis() {
		
		return this.firstName;
	}
	

}
