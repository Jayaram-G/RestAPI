package com.ems.serializeAnnotations;
import java.util.Arrays;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		String employeeJson;
		Employee ser_employee = new Employee();
		
		ser_employee.setFirstName("Jayaram");
		ser_employee.setLastName("G");
		ser_employee.setEmail("jairam@gmail.com");
		ser_employee.setSkills(Arrays.asList("java","selenium"));
		
		ObjectMapper mapper = new ObjectMapper();
		 
		employeeJson=mapper.writerWithDefaultPrettyPrinter()
		.writeValueAsString(ser_employee);
		
		System.out.println(employeeJson);

	}

}
