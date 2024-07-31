package com.ems.serializeAnnotations;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonAnyGetterPOJO anyGetterPOJO = new JsonAnyGetterPOJO();
		
		Map<String,Object> mapValues = new HashMap<String, Object>();
		
		mapValues.put("firstName","Jayaram");
		mapValues.put("lastName","G");
		mapValues.put("email","jairam@gmail.com");
		mapValues.put("skills", Arrays.asList("java","sql"));
		
		anyGetterPOJO.setEmployee(mapValues);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json=mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(anyGetterPOJO);
		
		System.out.println(json);
		
	}

}
