package dataservice.logdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.logPO.LogPO;

public interface LogDataService extends Remote{
	public LogPO findLog(LogPO lp) throws RemoteException;

	public void addLog(LogPO lp) throws RemoteException;

	public void changeLog(LogPO lp1, LogPO lp2) throws RemoteException;

	public void removeLog(LogPO lp) throws RemoteException;

	public ArrayList<LogPO> getLogList() throws RemoteException;

}
