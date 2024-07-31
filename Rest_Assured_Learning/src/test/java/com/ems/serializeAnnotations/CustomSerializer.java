package com.ems.serializeAnnotations;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSerializer extends StdSerializer<JsonSerializePOJO>{

	public CustomSerializer(Class<JsonSerializePOJO> t) {
		super(t);
		
	}
	
	public CustomSerializer() {
		this(null);
	}

	@Override
	public void serialize
	(JsonSerializePOJO value, 
			JsonGenerator generator, 
			SerializerProvider provider) throws IOException {
		
		generator.writeStartObject();
		generator.writeStringField("first_Name", value.getFirstName());
		generator.writeStringField("last_Name", value.getLastName());
		generator.writeStringField("email",value.getEmail());
		generator.writeEndObject();
		
	}
	
	

}
