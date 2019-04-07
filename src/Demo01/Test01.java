package Demo01;

import java.util.Scanner;

//有一组学员的成绩{99，85，82，63， 60}，将它们按升序排列。要增加一个学员的成绩，将它插入成绩序列，并保持升序
public class Test01 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		
		arr[0] = 99;
		arr[1] = 66;
		arr[2] = 44;
		arr[3] = 66;
		arr[4] = 78;
		arr[5] = 56;
		int index = arr.length;
		System.out.println("请输入新成绩");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (num > arr[i]) {
				index = i;
				break;
			}
		}
		// 元素后移
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];// index下标开始的元素后移一个位置
		}
		arr[index] = num;
		System.out.println("插入成绩的下标：" + index);
		System.out.println("插入后成绩信息是：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}

}
