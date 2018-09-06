package IOStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ReadingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\virtusa\\customer.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer cust;
			Object obj;
			while((obj = ois.readObject()) != null ) {
				cust = (Customer) obj;
				System.out.println(cust.getCode()+cust.getName()+cust.getCommn());
			}
			ois.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
