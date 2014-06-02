package jsonserialization;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.codehaus.jackson.map.ObjectMapper;
import org.glassfish.jersey.jackson.JacksonFeature;

public class JsonDeserialization {

	private static Client client;


	public static void main(final String[] args) {
		new ObjectMapper();

		try {
			//			final GaugeDevice readValue = mapper.readValue(json, GaugeDevice.class);

			client = ClientBuilder.newClient();
			client.register(JacksonFeature.class);
			final WebTarget target = client.target("http://.../");
			final GaugeDevice readValue = target.path("42").request("application/json").get(GaugeDevice.class);

			System.out.println("Utc Installation: \t" + readValue.getUtcInstallation());
			System.out.println("Manufacturer: \t\t" + readValue.getManufacturer());
			System.out.println("Value Offset: \t\t" + readValue.getValueOffset());
			System.out.println("Serial Number: \t\t" + readValue.getSerialNo());
			System.out.println("Comment: \t\t" + readValue.getComment());
			System.out.println("Digit Count: \t\t" + readValue.getDigitCount());
			System.out.println("Decimal Places: \t" + readValue.getDecimalPlaces());
			System.out.println("GaugeDeviceId: \t\t" + readValue.getGaugeDeviceId());
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}
}