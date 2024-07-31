package com.ems.json_schema_validation;
import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	
	@Test(enabled=false)
	public void validationUsingMatchesJsonSchemaInClassPath() {
		
		File inputJson = new File("src/test/resources/input.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		
	}
	
	@Test
	public void validationUsingMatchesJsonSchema() {
		
		File inputJson = new File("src/test/resources/input.json");
		File inputSchema = new File("src/test/resources/schema.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputSchema));
		
	}

}
