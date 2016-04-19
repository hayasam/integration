package eu.supersede.integration.datasource.poc.authentication.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomJsonDateSerializer extends JsonSerializer<Date>{

	@Override
	public void serialize(Date date, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String dateString = dateFormat.format(date);
	    jgen.writeString(dateString);
	}


}
