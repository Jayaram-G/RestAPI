package com.ems.pojo_concepts;
import java.util.List;

public class Employee {
	
	private String first_name;
	private String last_name;
	private String email;
	private List skills;
	
	public String getFirst_name() {
		System.out.println("GETTER "+ first_name);
		return first_name;
	}
	public void setFirst_name(String first_name) {
		System.out.println("SETTER "+ first_name);
		this.first_name = first_name;
	}
	public String getLast_name() {
		System.out.println("GETTER "+ last_name);
		return last_name;
	}
	public void setLast_name(String last_name) {
		System.out.println("SETTER "+ last_name);
		this.last_name = last_name;
	}
	public String getEmail() {
		System.out.println("GETTER "+ email);
		return email;
	}
	public void setEmail(String email) {
		System.out.println("SETTER "+ email);
		this.email = email;
	}
	public List getSkills() {
		System.out.println("GETTER "+ skills);
		return skills;
	}
	public void setSkills(List skills) {
		System.out.println("SETTER "+ skills);
		this.skills = skills;
	} 
	
	//business logic
	
	

}
