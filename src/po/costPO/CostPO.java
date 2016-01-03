package po.costPO;

import java.sql.Time;

public class CostPO {
	private double amount;//金额;
	private String operator;//付款人
	private String account;//付款账号
	private String date;//付款日期
	private String item;    //rent/shipping fee/salary/award
	private String ps;		//rentyear/transReceiptID/salarymonth

	public CostPO(String id, Time date,
			double am,String op,String ac,String it,String ps) {
		this.amount = am;
		this.operator = op;
		this.account = ac;
		this.item = it;
		this.ps = ps;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date=date;
	}
	public double getAmount(){
		return amount;
	}
	public String getAccount(){
		return account;
	}
	public String getOPerator(){
		return operator;
	}
	public String getItem(){
		return item;
	}
	public String getPS(){
		return ps;
	}

}
