package data.stratedarddata.standarddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.stratedarddataservice.StandardDataService;
import po.stratedardPO.StandardPO;

@SuppressWarnings("serial")
public class StandardData extends UnicastRemoteObject implements StandardDataService {
	public StandardData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static StandardList sl = new StandardList();

	@Override
	public StandardPO findStandard(StandardPO sp) {
		// TODO Auto-generated method stub
		return sl.getStandardPO(sp);
	}

	@Override
	public void addStandard(StandardPO sp) {
		// TODO Auto-generated method stub
		sl.addStandard(sp);

	}

	@Override
	public void changeStandard(StandardPO sp1, StandardPO sp2) {
		// TODO Auto-generated method stub
		sl.changeAccount(sp1, sp2);

	}

	@Override
	public void removeStandard(StandardPO sp) {
		// TODO Auto-generated method stub
		sl.removeStandard(sp);

	}

	@Override
	public ArrayList<StandardPO> getStandardList() {
		// TODO Auto-generated method stub
		ArrayList<StandardPO> a = sl.getStandardList();
		return a;
	}

}
