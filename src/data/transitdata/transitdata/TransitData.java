package data.transitdata.transitdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.transitdataservice.TransitDataService;
import po.transitPO.TransitPO;

@SuppressWarnings("serial")
public class TransitData extends UnicastRemoteObject implements TransitDataService {
	public TransitData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static TransitList tl = new TransitList();

	@Override
	public TransitPO findTransit(TransitPO tp) {
		// TODO Auto-generated method stub
		return tl.getTransitPO(tp);
	}

	@Override
	public void addTransit(TransitPO tp) {
		// TODO Auto-generated method stub
		tl.addTransit(tp);

	}

	@Override
	public void changeTransit(TransitPO tp1, TransitPO tp2) {
		// TODO Auto-generated method stub
		tl.changeTransit(tp1, tp2);

	}

	@Override
	public void removeTransit(TransitPO tp) {
		// TODO Auto-generated method stub
		tl.removeTransit(tp);

	}

	@Override
	public ArrayList<TransitPO> getTransitList() {
		// TODO Auto-generated method stub
		return tl.getTransitList();
	}

}
