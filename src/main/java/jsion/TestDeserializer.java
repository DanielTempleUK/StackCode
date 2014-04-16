package jsion;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class TestDeserializer extends JsonDeserializer<Test> {

	@Override
	public Test deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException {

		final Test toReturn = new Test();
		final String jsonObjectIDontWantToParse = null;

		if(JsonToken.START_OBJECT.equals(jp.getCurrentToken())) {
			while ( jsonObjectIDontWantToParse == null ) {
				final String fieldName = jp.getCurrentName();

				if("jsonObjectIDontWantToParse".equals(fieldName)) {
					final StringBuilder builder = new StringBuilder();
					final String fieldValue = jp.getText();
					builder.append(fieldValue);

					while( !"}".equals(jp.getText()) ) {
						jp.nextValue();
						builder.append("\""+jp.getCurrentName()+"\":");
						builder.append(jp.getText());
					}
					builder.append(jp.getText());
					toReturn.setJsonObjectIDontWantToParse( builder.toString() );
				}
				else {
					toReturn.setLastName(jp.getText());
				}
			}

			if(JsonToken.END_OBJECT.equals(jp.nextToken())) {
				return toReturn;
			}
			else {
				throw new IOException("Expected end of CurrencyAmountType, got: " + jp.getCurrentToken().name());
			}
		}
		else {
			throw new IOException("Expected start of CurrencyAmountType, got: " + jp.getCurrentToken().name());
		}
	}
}