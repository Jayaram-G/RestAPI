package com.ems.serializeAnnotations;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonPropertyOrder({"id","name","email"})
@JsonPropertyOrder(alphabetic = true)
public class JsonPropertyOrderPOJO {
	
	private String name;
	private String email;
	private int id;
	
	@JsonGetter(value="BId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@JsonGetter(value="Aname")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonGetter(value="Cemail")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
