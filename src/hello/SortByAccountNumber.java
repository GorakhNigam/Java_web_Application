package hello;

import java.util.Comparator;

public class SortByAccountNumber implements Comparator<Account> {

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		int diff = o1.getAccountNumber()-(o2.getAccountNumber());
		return diff;
	}


}
