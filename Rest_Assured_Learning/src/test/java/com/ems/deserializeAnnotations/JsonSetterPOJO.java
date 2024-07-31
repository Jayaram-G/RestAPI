package com.ems.deserializeAnnotations;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterPOJO {
	
	private int id;
	private String name;
	private String email;
	
	
	public int getId() {
		return id;
	}
	@JsonSetter(value="playerId")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
