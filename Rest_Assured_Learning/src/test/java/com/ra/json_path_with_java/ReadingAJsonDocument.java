package com.ra.json_path_with_java;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {
	
	public static void parseEveryTime() throws IOException {
		
		File jsonFile = new File("src/test/resources/bookstore.json");
		
		List<Object> priceList = JsonPath.read(jsonFile,"$..price");
		
		for (Object price : priceList) {
			System.out.println(price);
		}
		
	}
	
	public static void parseOneTime() throws IOException {
		
		InputStream jsonFile = new FileInputStream("src/test/resources/bookstore.json");
		
		Object parsedJsonDoc = Configuration.defaultConfiguration().jsonProvider().parse(jsonFile.readAllBytes());
		
		List<Object> categoryList = JsonPath.read(parsedJsonDoc,"$..category");
		
		for (Object category : categoryList) {
			System.out.println(category);
		}
		
	}
	
	public static void fluentAPI() throws IOException {
		
		File jsonFile = new File("src/test/resources/bookstore.json");
		
		DocumentContext context = JsonPath.parse(jsonFile);
		List<Object> categoryList1 =context.read("$..category");
		
		for (Object category : categoryList1) {
			System.out.println(category);
		}
		
		Configuration configuration = Configuration.defaultConfiguration();
		
		List<Object> categoryList2 = JsonPath
		.using(configuration)
		.parse(jsonFile)
		.read("$..category");
		
		for (Object category : categoryList2) {
			System.out.println(category);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		//parseOneTime();
		fluentAPI();
		
	}

}
