package ClosestValueInArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AccountDetails {
	int accountId;
	String accountName;
	String branchCode;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
	

	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", accountName=" + accountName + ", branchCode=" + branchCode
				+ "]";
	}

	public static void main(String[] args) {
		AccountDetails ac = new AccountDetails();
		ac.setAccountId(1);
		ac.setAccountName("aaaadddd");
		ac.setBranchCode("BNK785");
		AccountDetails ac2 = new AccountDetails();
		ac2.setAccountId(2);
		ac2.setAccountName("AaAA");
		ac2.setBranchCode("BNKr85");
		ArrayList<AccountDetails> list = new ArrayList<>();
		list.add(ac);
		list.add(ac2);
		System.out.println(list);
	
		for (int i = 0; i < list.size()-1; i++) {
			Collections.sort(list, new SortedAccount());
		}
		System.out.println(list);
	}
}
