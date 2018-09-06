package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class WritingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("C:\\virtusa\\customer.dat");
			Customer cust1 = new Customer(123,"abcd",5000);
			Customer cust2 = new Customer(456,"xyz",4000);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cust1);
			oos.writeObject(cust2);
			oos.close();
			fos.close();
			System.out.println("Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
