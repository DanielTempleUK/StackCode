package jsonserialization;

import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.LocalDateTime;

public class JsonSerialization {

	public static void main(final String[] args) {
		try {
			final Response response = new Response();

			final ObjectMapper mapper = new ObjectMapper();
			final String value = mapper.writeValueAsString(response);
			System.out.println(value);
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static class Response {
		LocalDateTime value = new LocalDateTime();
		public LocalDateTime getValue() {
			return this.value;
		}
		public void setValue(final LocalDateTime value) {
			this.value = value;
		}
	}
}
