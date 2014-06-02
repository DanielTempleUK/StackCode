package gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class GsonTest {

	public static void main(final String[] args) {
		final Node node = new Node();
		node.setName("Jeet123");
		node.setType(1);
		node.setSlug("");
		node.setEntity("company");

		final Link link = new Link();
		link.setSource("0");
		link.setTarget("1");
		link.setValue("1");
		link.setDistance("5");

		final List<Node> nodes = new ArrayList<Node>();
		nodes.add(node);

		final List<Link> links = new ArrayList<Link>();
		links.add(link);

		final EntryListContainer container = new EntryListContainer();
		container.setNodes(nodes);
		container.setLinks(links);

		final Gson gson = new Gson();
		System.out.println(gson.toJson(container));


		final List<Address> addressList = getAddressList("[{}, {}]");
		System.out.println(addressList);
		final List<Tweet> tweetList = getTweetList("[{}, {}]");
		System.out.println(tweetList);


	}

	public static List<Address> getAddressList(final String response) {
		return getGenericList(response, Address.class);
	}

	public static List<Tweet> getTweetList(final String response) {
		return getGenericList(response, Tweet.class);
	}

	@SuppressWarnings("serial")
	private static <T> List<T> getGenericList(final String response, final Class<T> elementType) {
		List<T> list = new ArrayList<T>();
		if (response != null && response.length() > 0) {
			try {
				final Gson gson = new Gson();
				final Type collectionType = new TypeToken<List<T>>(){}.where(new TypeParameter<T>() {}, elementType).getType();
				list = gson.fromJson(response, collectionType);
			}
			catch (final IllegalStateException ex) {
			}
			catch (final Exception ex) {
				ex.printStackTrace();
			}
		}
		return list;
	}
}