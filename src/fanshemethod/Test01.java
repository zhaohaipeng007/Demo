package fanshemethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Phone  p = new Phone();
//		p.call();
		
		Class<?> forName = Class.forName("fanshemethod.Phone");
		Constructor<?> constructor = forName.getDeclaredConstructor();
		constructor.setAccessible(true);

		Object obj = (Phone)constructor.newInstance();
		Method declaredMethod = forName.getDeclaredMethod("call");
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(obj);
		
		
	}

}
