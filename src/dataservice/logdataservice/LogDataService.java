package dataservice.logdataservice;

import java.util.ArrayList;

import po.logPO.LogPO;

public interface LogDataService {
	public LogPO findLog(LogPO lp);

	public void addLog(LogPO lp);

	public void changeLog(LogPO lp1, LogPO lp2);

	public void removeLog(LogPO lp);

	public ArrayList<LogPO> getLogList();

}
