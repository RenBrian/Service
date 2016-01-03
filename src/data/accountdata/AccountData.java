package data.accountdata;

import java.util.ArrayList;

import dataservice.accountdataservice.AccountDataService;
import po.accountPO.AccountPO;

public class AccountData implements AccountDataService {
	public static AccountList al = new AccountList();

	@Override
	public AccountPO findAccount(AccountPO ap) {
		// TODO Auto-generated method stub
		return al.getAccountPO(ap);
	}

	@Override
	public void addAccount(AccountPO ap) {
		// TODO Auto-generated method stub
		al.addAccount(ap);

	}

	@Override
	public void changeAccount(AccountPO ap1, AccountPO ap2) {
		// TODO Auto-generated method stub
		al.changeAccount(ap1, ap2);

	}

	@Override
	public void removeAccount(AccountPO ap) {
		// TODO Auto-generated method stub
		al.removeAccount(ap);

	}

	@Override
	public ArrayList<AccountPO> getAccountList() {
		// TODO Auto-generated method stub
		ArrayList<AccountPO> a = al.getAccountList();
		return a;
	}

}
