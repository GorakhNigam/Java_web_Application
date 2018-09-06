
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int serviceno = Integer.parseInt(args[0]);
		float prev = Float.parseFloat(args[1]);
		float pres = Float.parseFloat(args[2]);
		String type_of_cust = args[3];
		int sum = 0;
		
		if(1==1) {
			float total = pres - prev ;
			if(total <= 50) {
				System.out.println(total*1.45);
			}
			else if(total <= 100) {
				System.out.println(total*2.60);
			}
			else if(total <= 200) {
				
				System.out.println((total-100)*4.30+100*3.30);
			}
			else {
				float p = total;				
				int i = 1;
				while(p >= 0) {
					if(i == 1) {
						sum += 200*5;
						p -= 200;
						i++;
						//System.out.println(sum+" "+i);
					}
					else if(i==2) {
						sum += 100*7.20;
						p -= 100;
						i++;
					}
					else if(i == 3) {
						sum += 100*8.5;
						p -= 100; 
						i++;
					}
					else if(i==4) {
						sum += 100*9;
						p -= 100; 
						i++;
					}
					else {
						sum += (total-800)*9.5;
						p=0;
					}
				}
				
			}
			System.out.println(sum);
		}
		
		else {
			System.out.println("Non-Commercial");
		}
	}

}
