package com.ems.deserializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json = "{\r\n"
				+ "  \"employeeId\":7,\r\n"
				+ "  \"name\":\"jairam\",\r\n"
				+ "  \"email\":\"jai@seven.com\"\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonCreatorPOJO creatorPOJO = mapper.readValue(json,JsonCreatorPOJO.class);
		
		System.out.println(creatorPOJO.getId());
		System.out.println(creatorPOJO.getName());
		System.out.println(creatorPOJO.getEmail());

	}

}
