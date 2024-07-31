package com.ems.deserializeAnnotations;
import java.io.IOException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectDeserializer {

	public static void main(String[] args) throws IOException {
		
		String json ="{\r\n"
				+ "  \"email\":\"ram@seven.com\",\r\n"
				+ "  \"id\":7\r\n"
				+ "}";
		
		InjectableValues values = new InjectableValues.Std()
				.addValue(String.class,"ram");
		
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectReader reader = mapper.reader(values);
		
		JacksonInjectPOJO pojo = reader.readValue(json,JacksonInjectPOJO.class);
		
		System.out.println(pojo.getName());
		

	}

}
