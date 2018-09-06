package JavaSql;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarModels model = CarModels.BREEZA;
		if(model == CarModels.DZIRE)
			System.out.println("available");
		else
			System.out.println("not Available");
		switch(model) {
		case BREEZA:
		case BALENO:
		case DZIRE:
		case SWIFT:
			System.out.println("availabnle");
			default:
				System.out.println("not available");
		}
		
	}

}
