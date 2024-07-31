package com.ra.interview_concepts;
import io.restassured.RestAssured;

public class DefaultHostAndPort {

	public static void main(String[] args) {
		
		//http://localhost:8080/
		
					RestAssured
					.given()
					.log()
					.all()
					.when()
					.get();
										
			}

}
