package mocking;


import java.util.Dictionary;
import java.util.Hashtable;

import javax.naming.ConfigurationException;

import org.easymock.EasyMock;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;

@SuppressWarnings("unchecked")
public class LanguageMappingTest {

	final Dictionary<String, String> properties = EasyMock.createMock(Hashtable.class);
	final String object = "/etc/language-mapping";

	@Test
	public void testGetLanguageMapping() throws ConfigurationException {
		final LanguageMapping mappingService = new LanguageMapping();

		EasyMock.expect(this.properties.get(SealMappingServiceConstants.SEAL_MAPPING_PATH)).andReturn(this.object);
		EasyMock.replay(this.properties);

		mappingService.updated(this.properties);

		EasyMock.verify(this.properties);

		PowerMock.createPartialMock(LanguageMapping.class, "woop");
	}
}