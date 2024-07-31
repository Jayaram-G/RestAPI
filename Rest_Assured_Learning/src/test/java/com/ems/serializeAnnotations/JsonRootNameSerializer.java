package com.ems.serializeAnnotations;
import java.util.Arrays;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonRootNamePOJO rootNamePOJO = new JsonRootNamePOJO();
		
		rootNamePOJO.setFirstName("jai");
		rootNamePOJO.setLastName("ram");
		rootNamePOJO.setEmail("ram@seven.com");
		rootNamePOJO.setSkills(Arrays.asList("java","selenium"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		
		String employeeJson = mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(rootNamePOJO);
		
		System.out.println(employeeJson);

	}

}
