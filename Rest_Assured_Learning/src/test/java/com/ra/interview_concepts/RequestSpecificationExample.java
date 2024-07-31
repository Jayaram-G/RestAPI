package com.ra.interview_concepts;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {
	
	RequestSpecification rs;
	
	@BeforeSuite
	public void setRequestSpecification() {
		rs=RestAssured.given()
		.baseUri("http://localhost:3000")
		.basePath("/employees");
		RestAssured.requestSpecification=rs;
	}
	
	@Test
	public void getAllEmployees() {
		RestAssured
		.given()
		.when()
		.get()
		.prettyPrint();
	}
	
	@Test
	public void getAnEmployees() {
		RestAssured
		.given()
		.when()
		.get("/f9fb")
		.prettyPrint();
	}
	
	@Test()
	public void createAnEmployee() {
		
		RequestSpecification specification = RestAssured.given()
				.contentType(ContentType.JSON)
				.baseUri("http://localhost:3000")
				.basePath("/employees");
		
		RestAssured
		.given(specification)
		.body("{\r\n"
					+ "  \"first_name\": \"Santhosh\",\r\n"
					+ "  \"last_name\": \"kumar\",\r\n"
					+ "  \"email\": \"santhosh@gmail.com\"\r\n"
					+ "}")
		.when()
		.post()
		.prettyPrint();
	}

}
