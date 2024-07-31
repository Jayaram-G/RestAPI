package com.ra.auth;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class ApiKeyAuth {
	
	//badac2c749293840315bff1d80fa8589
	
	//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
	
	@Test(enabled=false)
	public void apiKeyAuth() {
		RestAssured.given()
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=Trichy&appid=badac2c749293840315bff1d80fa8589")
		.prettyPrint();
	}
	
	@Test
	public void apiKeyUsingParams() {
		RestAssured.given()
		.queryParam("q", "trichy")
		.queryParam("appid","badac2c749293840315bff1d80fa8589")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log().body();
		
	}

}
