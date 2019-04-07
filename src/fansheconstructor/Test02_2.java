package fansheconstructor;


	import java.lang.reflect.Constructor;

	/*
	 * 目标：通过反射获得Person类中私有的构造方法并创建Person实例对象
	 *    
	 *    1：获取指定类的字节码对象
	 *    2:通过字节码对象获取指定的构造方法对象
	 *    3：通过构造方法对象调用newInstance方法获取该类实例
	 * 
	 * 
	 */
	public class Test02_2 {

		public static void main(String[] args) throws Exception {

//			Person p = new Person("李四");
			
			// 1：获取指定类的字节码对象
			Class pclass = Class.forName("fansheconstructor.Person");
			// 2:通过字节码对象获取指定的构造方法对象
			Constructor pcon = pclass.getDeclaredConstructor(String.class);
			//2.2 允许暴力访问
			pcon.setAccessible(true);
			
			// 3：通过构造方法对象调用newInstance方法获取该类实例
			Object newInstance = pcon.newInstance("李四");
			Person p =(Person)newInstance;
			System.out.println(p);
			
		}

	
}
