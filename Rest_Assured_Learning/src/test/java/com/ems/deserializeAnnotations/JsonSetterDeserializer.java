package com.ems.deserializeAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json ="{\r\n"
				+ "  \"name\" : \"Dhoni\",\r\n"
				+ "  \"email\" : \"msd@seven.com\",\r\n"
				+ "  \"playerId\" : 7\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonSetterPOJO pojo = mapper.readValue(json,JsonSetterPOJO.class);
		
		System.out.println(pojo.getId());
		

	}

}
