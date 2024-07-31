package com.ra.interview_concepts;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class GetHeaders {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification requestSpecification = RestAssured.given()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ " \"first_name\":\"Jayaram\",\r\n"
				+ " \"last_name\":\"G\",\r\n"
				+ " \"email\":\"jairam@gmail.com\"\r\n"
				+ "}");

		Response response = requestSpecification.request(Method.POST,"/employees");
		
		QueryableRequestSpecification queryableRequestSpecification =
				SpecificationQuerier.query(requestSpecification);
		
		System.out.println(queryableRequestSpecification.getHeaders());
		System.out.println(queryableRequestSpecification.getBaseUri());
		System.out.println("......"+queryableRequestSpecification.getBasePath());
	}

}
