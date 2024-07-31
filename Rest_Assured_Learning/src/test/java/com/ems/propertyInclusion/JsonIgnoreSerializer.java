package com.ems.propertyInclusion;
import java.util.Date;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		String json;
		
		JsonIgnorePOJO pojo = new JsonIgnorePOJO();
		pojo.setName(null);
		pojo.setEmail("ram@seven.com");
		Date date = new Date();
		pojo.setDateOfBirth(date);
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		
		System.out.println(json);

	}

}
