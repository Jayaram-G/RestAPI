package com.ems.serializeAnnotations;
import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePOJO {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	//private String skills="java";
	@JsonRawValue
	private String skills = "{[\"java\"],[\"selenium\"]}";
	
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
