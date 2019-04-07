package fanshefield;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class<?> forName = Class.forName("fanshefield.User");
		Constructor<?> constructor = forName.getDeclaredConstructor();
		constructor.setAccessible(true);
		Object obj =(User) constructor.newInstance();
		Field fname = forName.getDeclaredField("age");
		fname.setAccessible(true);
		fname.set(obj, 18);
		Object object = fname.get(obj);
		System.out.println(object);
	}

}
