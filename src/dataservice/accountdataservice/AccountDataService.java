package dataservice.accountdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import po.accountPO.AccountPO;

public interface AccountDataService extends Remote{
	public AccountPO findAccount(AccountPO ap) throws RemoteException;

	public void addAccount(AccountPO ap) throws RemoteException;

	public void changeAccount(AccountPO ap1, AccountPO ap2) throws RemoteException;

	public void removeAccount(AccountPO ap) throws RemoteException;

	public ArrayList<AccountPO> getAccountList() throws RemoteException;

}
