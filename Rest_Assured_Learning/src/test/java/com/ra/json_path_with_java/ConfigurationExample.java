package com.ra.json_path_with_java;
import java.util.List;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfigurationExample {

	public static void main(String[] args) {
		
		String json ="[\r\n"
				+ "  {\r\n"
				+ "    \"name\":\"john\",\r\n"
				+ "    \"gender\":\"male\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"name\":\"ben\"\r\n"
				+ "  }\r\n"
				+ "]";
		
		Configuration configuration = Configuration.defaultConfiguration();
		
		configuration=configuration.addOptions(Option.REQUIRE_PROPERTIES);
		
		//configuration=configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
		
		/*
		 * Configuration configuration = Configuration.builder()
		 * .options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();
		 */

		List<String> result=JsonPath.using(configuration)
		.parse(json)
		.read("$[*].gender");
		
		System.out.println(result);

	}

}
