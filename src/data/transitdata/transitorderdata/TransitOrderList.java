package data.transitdata.transitorderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.transitPO.TransitOrderPO;

@SuppressWarnings("serial")
public class TransitOrderList implements Serializable {
	public TransitOrderPO getTransitOrderPO(TransitOrderPO tp) {
		try {
			FileInputStream fis = new FileInputStream("TransitOrderfile");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransitOrderPO> upl = (ArrayList<TransitOrderPO>) ois.readObject();
			for (TransitOrderPO po : upl) {
				if (po.getID().equals(tp.getID())) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public void addTransitOrder(TransitOrderPO tp) {
		try {
			FileInputStream fis = new FileInputStream("TransitOrder.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<TransitOrderPO> upl = (ArrayList<TransitOrderPO>) ois.readObject();
			upl.add(tp);
			FileOutputStream fs = new FileOutputStream("TransitOrder.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeTransitOrder(TransitOrderPO tp) {
		try {
			FileInputStream fis = new FileInputStream("TransitOrder.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransitOrderPO> upl = (ArrayList<TransitOrderPO>) ois.readObject();
			TransitOrderPO a = null;
			for (TransitOrderPO po : upl) {
				if (po.getID().equals(tp.getID())) {
					a = tp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("TransitOrder.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void changTransitOrder(TransitOrderPO tp1, TransitOrderPO tp2) {

		removeTransitOrder(tp1);
		addTransitOrder(tp2);
	}

	public ArrayList<TransitOrderPO> getTransitOrderList() {
		try {
			FileInputStream fis = new FileInputStream("TransitOrder.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransitOrderPO> upl = (ArrayList<TransitOrderPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
