package jsion;

import java.io.IOException;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.module.SimpleModule;

public class Deserializer {

	public static void main(final String[] args) throws IOException {
		final ObjectMapper mapper = new ObjectMapper();

		final SimpleModule simpleModule = new SimpleModule("", new Version(1, 1, 1, ""));
		simpleModule.addDeserializer(Test.class, new TestDeserializer());

		mapper.registerModule(simpleModule);


		final String testString = "{\"lastName\":\"Bitman\",\"jsonObjectIDontWantToParse\":{\"somefield\":1234}}";


		final Test user = mapper.readValue(testString, Test.class);
		System.out.println(user);
	}
}