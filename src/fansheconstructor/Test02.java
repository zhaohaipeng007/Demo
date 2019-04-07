package fansheconstructor;

import java.lang.reflect.Constructor;

public class Test02 {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub

		Class<?> forName = Class.forName("fansheconstructor.Person");
		Constructor<?> constructor = forName.getConstructor(String.class,int.class);
		Person p =(Person) constructor.newInstance("уехЩ",18);
		System.out.println(p);
	}

}
