package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\virtusa\\sample");
		file.mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream("C:\\virtusa\\sample.txt");
			for(int i = 65; i<=90; i++) {
				fos.write(i);
			}
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");

	}

}
