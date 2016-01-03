package po.billPO;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class BillPO implements Serializable{

	private ArrayList<String> orderID=new ArrayList<String>();
	private String courier;
	private double fee=0;
	private String date;
	
	
	public BillPO(){
		super();
	}
	public void addOrder(String id){
		orderID.add(id);
	}

	public ArrayList<String> getOrderID(){
		ArrayList<String> orderid=new ArrayList<String>();
		for(String op:orderID){
			orderid.add(op);
		}
		return orderid;
	}
	public void setCourier(String courier){
		this.courier=courier;
	}
	public String getCourier(){
		return courier;
	}

	public double getFee(){
		return fee;
	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public void setDate(String date){
		this.date=date;
	}
	public String getDate(){
		return date;
	}
}
