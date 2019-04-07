package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//录入十名学生的信息  输出最低的三名学生的成绩
public class Test01 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		Scanner sc =  new Scanner(System.in);
		//String str = new Scanner(System.in).next();
		System.out.println("请输入十名学生的成绩");
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入第"+(i+1)+"名学生的成绩");
			int score = sc.nextInt();
			arr[i] = score;
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		
	}

}
