package data.transitdata.hallloaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.transitdataservice.HallLoadDataService;
import po.transitPO.HallLoadPO;

@SuppressWarnings("serial")
public class HallLoadData extends UnicastRemoteObject implements HallLoadDataService {
	public HallLoadData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static HallLoadList hl = new HallLoadList();

	@Override
	public HallLoadPO findHallLoad(HallLoadPO hp) {
		// TODO Auto-generated method stub
		return hl.getHallLoadPO(hp);
	}

	@Override
	public void addHallLoad(HallLoadPO hp) {
		// TODO Auto-generated method stub
		hl.addHallLoad(hp);

	}

	@Override
	public void changeHallLoad(HallLoadPO hp1, HallLoadPO hp2) {
		// TODO Auto-generated method stub
		hl.changeHallLoad(hp1, hp2);

	}

	@Override
	public void removeHallLoad(HallLoadPO hp) {
		// TODO Auto-generated method stub
		hl.removeHallLoad(hp);

	}

	@Override
	public ArrayList<HallLoadPO> getHallLoadList() {
		// TODO Auto-generated method stub
		return hl.getHallLoadList();
	}

}
