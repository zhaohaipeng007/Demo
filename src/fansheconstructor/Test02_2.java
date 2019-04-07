package fansheconstructor;


	import java.lang.reflect.Constructor;

	/*
	 * Ŀ�꣺ͨ��������Person����˽�еĹ��췽��������Personʵ������
	 *    
	 *    1����ȡָ������ֽ������
	 *    2:ͨ���ֽ�������ȡָ���Ĺ��췽������
	 *    3��ͨ�����췽���������newInstance������ȡ����ʵ��
	 * 
	 * 
	 */
	public class Test02_2 {

		public static void main(String[] args) throws Exception {

//			Person p = new Person("����");
			
			// 1����ȡָ������ֽ������
			Class pclass = Class.forName("fansheconstructor.Person");
			// 2:ͨ���ֽ�������ȡָ���Ĺ��췽������
			Constructor pcon = pclass.getDeclaredConstructor(String.class);
			//2.2 ����������
			pcon.setAccessible(true);
			
			// 3��ͨ�����췽���������newInstance������ȡ����ʵ��
			Object newInstance = pcon.newInstance("����");
			Person p =(Person)newInstance;
			System.out.println(p);
			
		}

	
}
