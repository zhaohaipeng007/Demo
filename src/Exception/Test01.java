package Exception;
//数组下标越界异常
public class Test01 {

	public static void main(String[] args) {

		int[] arr = new int[4];
		try{
		     int a = arr[4];
	    }catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("我错了");
//e.printStackTrace();
	    }finally{
	    	System.out.println("数组下标越界异常");
	    }
	}
	

}
