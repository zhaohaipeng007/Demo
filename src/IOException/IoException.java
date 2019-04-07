package IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Io流异常处理
public class IoException {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			//实例化
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("b.txt");
			
			byte[] brr = new byte[1024];
			int len = 0;
			while((len = fis.read(brr))!=-1){
				fos.write(brr,0,len);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
