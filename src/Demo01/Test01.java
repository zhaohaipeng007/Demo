package Demo01;

import java.util.Scanner;

//��һ��ѧԱ�ĳɼ�{99��85��82��63�� 60}�������ǰ��������С�Ҫ����һ��ѧԱ�ĳɼ�����������ɼ����У�����������
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
		System.out.println("�������³ɼ�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (num > arr[i]) {
				index = i;
				break;
			}
		}
		// Ԫ�غ���
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];// index�±꿪ʼ��Ԫ�غ���һ��λ��
		}
		arr[index] = num;
		System.out.println("����ɼ����±꣺" + index);
		System.out.println("�����ɼ���Ϣ�ǣ�");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}

}
