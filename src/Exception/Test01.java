package Exception;
//�����±�Խ���쳣
public class Test01 {

	public static void main(String[] args) {

		int[] arr = new int[4];
		try{
		     int a = arr[4];
	    }catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("�Ҵ���");
//e.printStackTrace();
	    }finally{
	    	System.out.println("�����±�Խ���쳣");
	    }
	}
	

}
