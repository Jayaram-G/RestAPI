package com.ems.non_bdd_style;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeCRUDRequestsNonBDDStyle {
	
	@Test(enabled=false)
	public void getAllEmployees() {
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.GET,"/employees");
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.asPrettyString());
		
		}
	
	@Test(enabled=false)
	public void createAnEmployee() {
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification = RestAssured.given()
		.headers("Content-Type","application/json")
		.body("  {\r\n"
				+ "      \"first_name\": \"Jayaram\",\r\n"
				+ "      \"last_name\": \"G\",\r\n"
				+ "      \"email\": \"jairam@gmail.com\"\r\n"
				+ "    }");
		Response response = requestSpecification.request(Method.POST,"/employees");
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.asPrettyString());
		
		}
	
	@Test(enabled=false)
	public void updateAnEmployee() {
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification = RestAssured.given()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"first_name\": \"Santhosh\",\r\n"
				+ "  \"last_name\": \"kumar\",\r\n"
				+ "  \"email\": \"santhosh@gmail.com\"\r\n"
				+ "}");
		Response response = requestSpecification.request(Method.PUT,"/employees/ef2a");
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.asPrettyString());
	}
	
	@Test(enabled=false)
	public void deleteAnEmployee() {
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.DELETE,"/employees/ef2a");
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.asPrettyString());
		
	}
	
	@Test
	public void getAnEmployee() {
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.GET,"/employees/f9fb");
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.asPrettyString());
		
	}
	

}
