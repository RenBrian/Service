package data.transitdata.transitorderdata;

import java.util.ArrayList;

import dataservice.transitdataservice.TransitOrderDataService;
import po.transitPO.TransitOrderPO;

public class TransitOrderData implements TransitOrderDataService {
	public static TransitOrderList tl = new TransitOrderList();

	@Override
	public TransitOrderPO findTransitOrder(TransitOrderPO tp) {
		// TODO Auto-generated method stub
		return tl.getTransitOrderPO(tp);
	}

	@Override
	public void addTransitOrder(TransitOrderPO tp) {
		// TODO Auto-generated method stub
		tl.addTransitOrder(tp);

	}

	@Override
	public void changeTransitOrder(TransitOrderPO tp1, TransitOrderPO tp2) {
		// TODO Auto-generated method stub
		tl.changTransitOrder(tp1, tp2);

	}

	@Override
	public void removeTransitOrder(TransitOrderPO tp) {
		// TODO Auto-generated method stub
		tl.removeTransitOrder(tp);

	}

	@Override
	public ArrayList<TransitOrderPO> getTransitOrderList() {
		// TODO Auto-generated method stub
		return tl.getTransitOrderList();
	}

}
