package arras;


public class Arrays {

	public static void main(final String[] args) {
		final Object[] objects = new Object[]{new String(""),new String(""), new String("")};
		System.out.println(objects.toString());

		final String[] typedObjects = toTypeArray(String.class, objects);
		System.out.println(typedObjects.toString());

	}

	@SuppressWarnings("unchecked")
	public static <T extends Object> T[] toTypeArray( final Class<T> typeClazz, final Object... objects) {
		final T[] array = (T[]) new Object[objects.length];

		for( int i = 0; i < objects.length; i++ ) {
			array[i] = typeClazz.cast( objects[i] );
		}

		return array;
	}

}
