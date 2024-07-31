package com.ems.serializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonRawValuePOJO rawValuePOJO = new JsonRawValuePOJO();
		
		rawValuePOJO.setId(7);
		rawValuePOJO.setFirstName("Jayaram");
		rawValuePOJO.setLastName("G");
		rawValuePOJO.setEmail("jairam@gmail.com");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String employeeJson = mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(rawValuePOJO);
		
		System.out.println(employeeJson);
	}

}
