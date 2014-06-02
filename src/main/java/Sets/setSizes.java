package Sets;

import java.util.HashMap;
import java.util.Map;

public class setSizes {

	public static void main( final String[] args) {
		final Map<String, String> map = new HashMap<String, String>(5);

		map.put("A", "VALUE");
		map.put("B", "VALUE");
		map.put("C", "VALUE");
		map.put("D", "VALUE");
		map.put("E", "VALUE");

		System.out.println(map.size());
		map.put("F", "VALUE");
		System.out.println(map.size());
	}
}