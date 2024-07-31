package com.ems.serializeAnnotations;
import java.util.Arrays;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializerAnnotationSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonSerializePOJO serializePOJO = new JsonSerializePOJO();
		
		serializePOJO.setFirstName("jai");
		serializePOJO.setLastName("ram");
		serializePOJO.setEmail("jai@seven.com");
		serializePOJO.setSkills(Arrays.asList("java","selenium"));
		
		Devices devices = new Devices();
		devices.setLaptop("Macbook Pro");
		devices.setMobile("Iphone 15 pro max");
		serializePOJO.setDevices(devices);
		
		ObjectMapper mapper = new ObjectMapper();
		
		/*
		 * SimpleModule simpleModule = new SimpleModule();
		 * 
		 * simpleModule.addSerializer(JsonSerializePOJO.class,new CustomSerializer());
		 * 
		 * mapper.registerModule(simpleModule);
		 */
		
		String employeeJson = mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(serializePOJO);
		
		System.out.println(employeeJson);

	}

}
