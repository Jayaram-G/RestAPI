package com.ems.serializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonGetterPOJO getterPOJO = new JsonGetterPOJO();
		
		getterPOJO.setId(7);
		getterPOJO.setName("Dhoni");
		getterPOJO.setEmail("msd@seven.com");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(getterPOJO);
		
		System.out.println(json);
	}

}
