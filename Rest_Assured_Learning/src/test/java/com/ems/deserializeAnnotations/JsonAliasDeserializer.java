package com.ems.deserializeAnnotations;
import com.ems.serializeAnnotations.JsonAliasPOJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json = "{\r\n"
				+ "  \"empId\":7,\r\n"
				+ "  \"name\":\"ram\",\r\n"
				+ "  \"email\":\"ram@seven.com\"\r\n"
				+ "}";
		/*
		 * ObjectMapper mapper = new ObjectMapper();
		 * 
		 * JsonAliasPOJO pojo = mapper.readValue(json,JsonAliasPOJO.class);
		 */
		
		JsonAliasPOJO pojo=new ObjectMapper().readerFor(JsonAliasPOJO.class).readValue(json);
		
		System.out.println(pojo.getId());
		

	}

}
