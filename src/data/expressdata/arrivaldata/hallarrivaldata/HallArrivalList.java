package data.expressdata.arrivaldata.hallarrivaldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.expressPO.arrivalPO.HallArrivalPO;

@SuppressWarnings("serial")
public class HallArrivalList implements Serializable {
	public HallArrivalPO getHallArrivalPO(HallArrivalPO hp) {
		try {
			FileInputStream fis = new FileInputStream("HallArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallArrivalPO> upl = (ArrayList<HallArrivalPO>) ois.readObject();
			for (HallArrivalPO po : upl) {
				if (po.getID().equals(hp.getID())) {
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
	public void addHallArrival(HallArrivalPO hp) {
		try {
			FileInputStream fis = new FileInputStream("HallArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<HallArrivalPO> upl = (ArrayList<HallArrivalPO>) ois.readObject();
			upl.add(hp);
			FileOutputStream fs = new FileOutputStream("HallArrival.file");
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

	public void removeHallArrival(HallArrivalPO hp) {
		try {
			FileInputStream fis = new FileInputStream("HallArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallArrivalPO> upl = (ArrayList<HallArrivalPO>) ois.readObject();
			HallArrivalPO a = null;
			for (HallArrivalPO po : upl) {
				if (po.getID().equals(hp.getID())) {
					a = hp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("HallArrival.file");
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

	public void changeHallArrival(HallArrivalPO hp1, HallArrivalPO hp2) {

		removeHallArrival(hp1);
		addHallArrival(hp2);
	}

	public ArrayList<HallArrivalPO> getHallArrivalList() {
		try {
			FileInputStream fis = new FileInputStream("HallArrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallArrivalPO> upl = (ArrayList<HallArrivalPO>) ois.readObject();
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
