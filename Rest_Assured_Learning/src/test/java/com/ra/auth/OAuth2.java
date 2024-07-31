package com.ra.auth;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class OAuth2 {
	
	@Test
	public void oAuth2() {
		String token="";
		given()
		.auth()
		.oauth2(token)
		.when()
		.get("https://api.github.com/user/repos")
		.prettyPrint();
	}

}
