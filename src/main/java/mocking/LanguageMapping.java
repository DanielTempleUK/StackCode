package mocking;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javax.naming.ConfigurationException;

public class LanguageMapping {

	protected Map<String, String> languageMapping;

	public Map<String, String> getLanguageMapping() {
		return this.languageMapping;
	}

	public void updated(final Dictionary<String, String> properties) throws ConfigurationException {
		this.languageMapping = new HashMap<String, String>();
		final String mappingPath = properties.get(
				SealMappingServiceConstants.SEAL_MAPPING_PATH).toString();
		System.out.println(mappingPath);
	}
}
