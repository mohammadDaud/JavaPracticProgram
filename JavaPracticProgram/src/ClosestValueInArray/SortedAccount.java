package ClosestValueInArray;

import java.util.Comparator;

public class SortedAccount implements Comparator<AccountDetails> {

	@Override
	public int compare(AccountDetails a, AccountDetails b) {
		
		return a.getAccountName().compareTo(b.getAccountName());
	}

}
