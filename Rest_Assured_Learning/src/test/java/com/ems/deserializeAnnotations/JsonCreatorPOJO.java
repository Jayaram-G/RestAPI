package com.ems.deserializeAnnotations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonCreatorPOJO {
	
	private int id;
	private String name;
	private String email;
	
	@JsonCreator
	public JsonCreatorPOJO(
			@JsonProperty("employeeId")
			int id,
			@JsonProperty("name")
			String name,
			@JsonSetter("email")
			String email) {
		
		this.id=id;
		this.email=email;
		this.name=name;
				
		}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	

}
