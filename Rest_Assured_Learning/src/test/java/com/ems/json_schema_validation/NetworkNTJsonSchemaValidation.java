package com.ems.json_schema_validation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class NetworkNTJsonSchemaValidation {
	
	@Test
	public void validateJsonSchema() throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File inputJson = new File("src/test/resources/input.json");
		
		InputStream inputSchema = new FileInputStream("src/test/resources/schema.json");
		
		JsonNode jsonNode = mapper.readTree(inputJson);
		
		JsonSchema jsonSchema = factory.getSchema(inputSchema);
		
		Set<ValidationMessage> result = jsonSchema.validate(jsonNode);
		
		if(result.isEmpty()) {
			System.out.println("No Validation Errors");
		}else {
			for (ValidationMessage message : result) {
				System.out.println(message);
			}
		}
		
	}
	
}
