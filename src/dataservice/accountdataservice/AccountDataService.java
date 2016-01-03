package dataservice.accountdataservice;

import java.util.ArrayList;

import po.accountPO.AccountPO;

public interface AccountDataService {
	public AccountPO findAccount(AccountPO ap);

	public void addAccount(AccountPO ap);

	public void changeAccount(AccountPO ap1, AccountPO ap2);

	public void removeAccount(AccountPO ap);

	public ArrayList<AccountPO> getAccountList();

}
