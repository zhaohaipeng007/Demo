package fansheconstructor;

import java.lang.reflect.Constructor;

public class Test03 {

	public static void main(String[] args) throws Exception {

		Class<?> forName = Class.forName("fansheconstructor.Person");
        Constructor<?> declaredConstructor = forName.getDeclaredConstructor(String.class);
		
        declaredConstructor.setAccessible(true);
		Object obj = (Person)declaredConstructor.newInstance("lisi");
		System.out.println(obj);
	}

}
