package Demo01;

import java.util.Scanner;

//7. 求出4家店的最低手机价格及原始位置(下标）

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] drr = new double[4];
		for (int j = 0; j < 4; j++) {
			
			System.out.println("请输入第"+(j+1)+"家手机店的手机价格");
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
		System.out.println("价格最低的是第"+index+"家，他的价格为"+min);
	}

}
