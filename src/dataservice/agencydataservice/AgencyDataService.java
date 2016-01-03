package dataservice.agencydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import po.agencyPO.AgencyPO;

public interface AgencyDataService extends Remote{
	public AgencyPO findAgency(AgencyPO ap)  throws RemoteException;

	public void addAgency(AgencyPO ap) throws RemoteException;

	public void changeAgency(AgencyPO ap1, AgencyPO ap2) throws RemoteException;

	public void removeAgency(AgencyPO ap) throws RemoteException;

	public ArrayList<AgencyPO> getAgencyList() throws RemoteException;
}
