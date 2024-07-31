package com.ems.serializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonPropertyOrderPOJO propertyOrderPOJO = new JsonPropertyOrderPOJO();
		
		propertyOrderPOJO.setId(7);
		propertyOrderPOJO.setName("ram");
		propertyOrderPOJO.setEmail("ram@seven.com");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json= mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(propertyOrderPOJO);
		
		System.out.println(json);

	}

}
