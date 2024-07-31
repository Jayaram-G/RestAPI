package com.ems.deserializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserialize {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json ="{\r\n"
				+ "  \"skills\" : [ \"java\", \"sql\" ],\r\n"
				+ "  \"firstName\" : \"Jayaram\",\r\n"
				+ "  \"lastName\" : \"G\",\r\n"
				+ "  \"email\" : \"jairam@gmail.com\"\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonAnySetterPOJO pojo = mapper.readValue(json,JsonAnySetterPOJO.class);
		
		System.out.println(pojo.getEmployee());
		
		
	}
	
	

}
