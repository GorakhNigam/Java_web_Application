package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("C:\\virtusa\\sample1.txt");
			FileInputStream fis = new FileInputStream("C:\\virtusa\\sample.txt");
			int x;
			while((x = fis.read()) != -1) {
				fos.write(x);
				//System.out.print((char)x);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
