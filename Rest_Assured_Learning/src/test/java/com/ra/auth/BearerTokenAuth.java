package com.ra.auth;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class BearerTokenAuth {
	
	@Test
	public void bearerTokenAuth() {
		String token="";
		given()
		.header("Authorization","Bearer "+token)
		.when()
		.get("https://api.github.com/user/repos")
		.prettyPrint();
		
	}

}
