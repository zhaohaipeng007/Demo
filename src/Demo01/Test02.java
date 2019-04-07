package Demo01;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("ÇëÊäÈëÒ»´®ÂÒĞòµÄ×Ö·û");
//
//		String str = new Scanner(System.in).next();
		String[] srr = new String[]{"a","b","d","g","c","f","e"};
		Arrays.sort(srr);

		for (int i = 0; i < srr.length; i++) {
			if(i==srr.length-1){
				System.out.print(srr[i]);
			}else{
				System.out.print(srr[i]+",");
			}
		}
		System.out.println();
		System.out.println("-----------------------------");
		for (int i = srr.length-1; i>=0; i--) {
			if(i==0){
				System.out.print(srr[i]);
			}else{
			    System.out.print(srr[i]+",");
		    }
		}
	}

}
