package Demo01;

import java.util.Scanner;

//7. ���4�ҵ������ֻ��۸�ԭʼλ��(�±꣩

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] drr = new double[4];
		for (int j = 0; j < 4; j++) {
			
			System.out.println("�������"+(j+1)+"���ֻ�����ֻ��۸�");
			double price = sc.nextDouble();
			drr[j] = price;
		}
		double min = drr[0];
		int index = 0;
		for (int i = 0; i < drr.length; i++) {
			if(min>drr[i]){
				index = i+1;
				min = drr[i];
				
			}
		}
		System.out.println("�۸���͵��ǵ�"+index+"�ң����ļ۸�Ϊ"+min);
	}

}
