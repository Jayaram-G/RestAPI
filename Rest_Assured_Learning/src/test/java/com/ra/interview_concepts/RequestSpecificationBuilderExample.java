package com.ra.interview_concepts;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilderExample {

	public static void main(String[] args) {
		
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		
		/*
		 * builder.setBaseUri("http://localhost:3000");
		 * builder.setBasePath("/employees/f9fb");
		 * 
		 * RequestSpecification spec = builder.build();
		 */
		
		 RequestSpecification spec =builder.setBaseUri
				 ("http://localhost:3000").setBasePath("/employees").build();
		
		RestAssured.given(spec).get("/f9fb").prettyPrint();
		
		

	}

}
