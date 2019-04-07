package fansheconstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 获取构造方法  
 * getConstructors();
 */
public class Test01 {

	public static void main(String[] args) throws Exception{

		Class forName = Class.forName("fansheconstructor.Person");
		Constructor constructors = forName.getConstructor();
		//Object newInstance = constructors.newInstance();
		Person p = (Person)(constructors.newInstance());
		System.out.println(p);
	}

}
