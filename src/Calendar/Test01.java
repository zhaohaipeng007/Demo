package Calendar;

import java.util.Calendar;

//������������������������
public class Test01 {


	public static void main(String[] args) {
//
//		Calendar c1 =  Calendar.getInstance();
//		Calendar c2  =Calendar.getInstance();
//				//Calendar my = Calendar.getInstance();
//		int day1 = c1.get(Calendar.DATE);
//		int day2 = c2.get(Calendar.DATE);
//		int day = day2-day1;
//		System.out.println(day);
//		System.out.println(day2);
		Calendar my = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		//���ó��������� 1995-05-10
		my.set(Calendar.YEAR, 1995);
		my.set(Calendar.MONTH, 4);
		my.set(Calendar.DATE, 10);
		//��ȡʱ���е�����
		int day = c.get(Calendar.DAY_OF_YEAR);
		int myDay = my.get(Calendar.DAY_OF_YEAR);
		System.out.println(day - myDay);
		System.out.println(day);
	}

}
