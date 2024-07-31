package com.ems.serializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonValuePOJO valuePOJO = new JsonValuePOJO();
		
		valuePOJO.setId(7);
		valuePOJO.setFirstName("jai");
		valuePOJO.setLastName("ram");
		valuePOJO.setEmail("ram@seven.com");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String employeeJson = mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(valuePOJO);
		
		System.out.println(employeeJson);
		
		
	}

}
