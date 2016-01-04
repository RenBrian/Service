package data.expressdata.deliverydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.expressPO.deliveryPO.DeliveryPO;

@SuppressWarnings("serial")
public class DeliveryList implements Serializable {

	public DeliveryPO getDeliveryPO(DeliveryPO dp) {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> upl = (ArrayList<DeliveryPO>) ois.readObject();
			for (DeliveryPO po : upl) {
				if (po.getID().equals(dp.getID())) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Delivery.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DeliveryPO> dpl = new ArrayList<DeliveryPO>();
				dpl.add(dp);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
	public void addDelivery(DeliveryPO dp) {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<DeliveryPO> upl = (ArrayList<DeliveryPO>) ois.readObject();
			upl.add(dp);
			FileOutputStream fs = new FileOutputStream("Delivery.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Delivery.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DeliveryPO> dpl = new ArrayList<DeliveryPO>();
				dpl.add(dp);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeDelivery(DeliveryPO dp) {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> upl = (ArrayList<DeliveryPO>) ois.readObject();
			DeliveryPO a = null;
			for (DeliveryPO po : upl) {
				if (po.getID().equals(dp.getID())) {
					a = dp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Delivery.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Delivery.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DeliveryPO> dpl = new ArrayList<DeliveryPO>();
				dpl.add(dp);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void changeDelivery(DeliveryPO dp1, DeliveryPO dp2) {

		removeDelivery(dp1);
		addDelivery(dp2);
	}

	public ArrayList<DeliveryPO> getDeliveryList() {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> upl = (ArrayList<DeliveryPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Delivery.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DeliveryPO> dpl = new ArrayList<DeliveryPO>();
				os.writeObject(dpl);
				os.close();
				return dpl;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
