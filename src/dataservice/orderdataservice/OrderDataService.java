package dataservice.orderdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.orderPO.OrderPO;

public interface OrderDataService extends Remote{
	/*
	 * 添加订单
	 */
	public void addOrder(OrderPO op) throws RemoteException;

	/*
	 * 查找订单
	 */
	public OrderPO findOrder(OrderPO op) throws RemoteException;

	/*
	 * 修改订单
	 */
	public void changeOrder(OrderPO op1, OrderPO po2) throws RemoteException;

	/*
	 * 删除订单（暂时应该不需要。。。
	 */
	public void removeOrder(OrderPO op) throws RemoteException;

	/*
	 * 获取订单列表
	 */
	public ArrayList<OrderPO> getOrderList() throws RemoteException;

}
