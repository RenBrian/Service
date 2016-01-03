package dataservice.transitdataservice;

import java.util.ArrayList;

import po.transitPO.TransitOrderPO;

public interface TransitOrderDataService {
	public TransitOrderPO findTransitOrder(TransitOrderPO tp);

	public void addTransitOrder(TransitOrderPO tp);

	public void changeTransitOrder(TransitOrderPO tp1, TransitOrderPO tp2);

	public void removeTransitOrder(TransitOrderPO tp);

	public ArrayList<TransitOrderPO> getTransitOrderList();
}
