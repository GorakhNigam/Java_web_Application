package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class SampleInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter code name salary");
		int code;
		try {
			code = Integer.parseInt(br.readLine());
			String name = br.readLine();
			double sal = Double.parseDouble(br.readLine());
			System.out.println(code+name+sal);
		}  catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
