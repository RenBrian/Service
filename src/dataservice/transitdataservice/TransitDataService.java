package dataservice.transitdataservice;

import java.util.ArrayList;

import po.transitPO.TransitPO;

public interface TransitDataService {
	public TransitPO findTransit(TransitPO tp);

	public void addTransit(TransitPO tp);

	public void changeTransit(TransitPO tp1, TransitPO tp2);

	public void removeTransit(TransitPO tp);

	public ArrayList<TransitPO> getTransitList();

}
