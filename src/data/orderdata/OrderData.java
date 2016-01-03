package data.orderdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.orderPO.OrderPO;
import dataservice.orderdataservice.OrderDataService;

@SuppressWarnings("serial")
public class OrderData extends UnicastRemoteObject implements OrderDataService {
	public OrderData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static OrderList ol = new OrderList();;

	@Override
	public void addOrder(OrderPO ov) {
		ol.addOrder(ov);
	}

	public void changeOrder(OrderPO op1, OrderPO op2) {
		ol.changeOrder(op1, op2);
	}

	public OrderPO findOrder(OrderPO op) {
		OrderPO po = ol.getOrderPO(op);
		return po;
	}

	public void removeOrder(OrderPO op) {
		ol.removeOrder(op);
	}

	@Override
	public ArrayList<OrderPO> getOrderList() {
		ArrayList<OrderPO> opl = ol.getOrderList();
		return opl;
	}

}
