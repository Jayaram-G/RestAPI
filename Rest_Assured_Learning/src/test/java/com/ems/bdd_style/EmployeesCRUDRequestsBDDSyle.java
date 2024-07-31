package com.ems.bdd_style;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeesCRUDRequestsBDDSyle {
	
	@Test(enabled=false)
	public void getAllEmployees() {
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000")
		.when()
			.get("/employees")
		.prettyPrint();
	}
	
	@Test(enabled=false)
	public void createAnEmployee() {
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "  \"first_name\": \"Santhosh\",\r\n"
					+ "  \"last_name\": \"kumar\",\r\n"
					+ "  \"email\": \"santhosh@gmail.com\"\r\n"
					+ "}")
		.when()
			.post("/employees")
		.prettyPrint();
	}
	
	@Test(enabled=false)
	public void updateAnEmployee() {
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "  \"first_name\": \"Iron\",\r\n"
					+ "  \"last_name\": \"Man\",\r\n"
					+ "  \"email\": \"Iron@marvel.com\"\r\n"
					+ "}")
			.when()
				.put("/employees/18c3")
			.prettyPrint();
	}
	
	@Test
	public void deleteAnEmployee() {
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000")
		.when()
			.delete("/employees/18c3")
		.prettyPrint();
	}
	

}
