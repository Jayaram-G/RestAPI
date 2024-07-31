package com.ems.pojo_concepts;
import java.util.Arrays;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeAndDeserialize{
	
	ObjectMapper mapper = new ObjectMapper();
	String employeeJson;
	
	public void serialize() throws JsonProcessingException {
		Employee employee1 = new Employee();
		employee1.setFirst_name("Jayaram");
		employee1.setLast_name("G");
		employee1.setEmail("jairam@gmail.com");
		employee1.setSkills(Arrays.asList("java","selenium"));
		
		employeeJson = mapper
				.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);

		System.out.println(employeeJson);
	}
	
	public void deserialize() throws JsonMappingException, JsonProcessingException {
		
		String employeeJson="{\r\n"
				+ "  \"first_name\" : \"Jayaram\",\r\n"
				+ "  \"last_name\" : \"G\",\r\n"
				+ "  \"email\" : \"jairam@gmail.com\",\r\n"
				+ "  \"skills\" : [ \"java\", \"selenium\" ]\r\n"
				+ "}";
		Employee obj = mapper.readValue(employeeJson, Employee.class);
		System.out.println(obj.getFirst_name());
		System.out.println(obj.getLast_name());
		System.out.println(obj.getEmail());
		System.out.println(obj.getSkills());
		
	}

	public static void main(String[] args) throws JsonProcessingException {
		
		SerializeAndDeserialize serializeAndDeserialize = 
				new SerializeAndDeserialize();
		
		serializeAndDeserialize.deserialize();
	}

}
