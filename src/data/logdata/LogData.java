package data.logdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.logdataservice.LogDataService;
import po.logPO.LogPO;

@SuppressWarnings("serial")
public class LogData extends UnicastRemoteObject implements LogDataService {
	public LogData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static LogList ll = new LogList();

	@Override
	public LogPO findLog(LogPO lp) {
		// TODO Auto-generated method stub
		return ll.getLogPO(lp);
	}

	@Override
	public void addLog(LogPO lp) {
		// TODO Auto-generated method stub
		ll.addLog(lp);

	}

	@Override
	public void changeLog(LogPO lp1, LogPO lp2) {
		// TODO Auto-generated method stub
		ll.changeLog(lp1, lp2);

	}

	@Override
	public void removeLog(LogPO lp) {
		// TODO Auto-generated method stub
		ll.removeLog(lp);

	}

	@Override
	public ArrayList<LogPO> getLogList() {
		// TODO Auto-generated method stub
		return ll.getLogList();
	}

}
