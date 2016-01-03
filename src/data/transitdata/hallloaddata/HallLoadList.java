package data.transitdata.hallloaddata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.transitPO.HallLoadPO;

@SuppressWarnings("serial")
public class HallLoadList implements Serializable {
	public HallLoadPO getHallLoadPO(HallLoadPO hp) {
		try {
			FileInputStream fis = new FileInputStream("HallLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallLoadPO> upl = (ArrayList<HallLoadPO>) ois.readObject();
			for (HallLoadPO po : upl) {
				if (po.getIDOfHall().equals(hp.getIDOfHall())) {
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
	public void addHallLoad(HallLoadPO hp) {
		try {
			FileInputStream fis = new FileInputStream("HallLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<HallLoadPO> upl = (ArrayList<HallLoadPO>) ois.readObject();
			upl.add(hp);
			FileOutputStream fs = new FileOutputStream("HallLoad.file");
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

	public void removeHallLoad(HallLoadPO hp) {
		try {
			FileInputStream fis = new FileInputStream("HallLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallLoadPO> upl = (ArrayList<HallLoadPO>) ois.readObject();
			HallLoadPO a = null;
			for (HallLoadPO po : upl) {
				if (po.getIDOfHall().equals(hp.getIDOfHall())) {
					a = hp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("HallLoad.file");
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

	public void changeHallLoad(HallLoadPO hp1, HallLoadPO hp2) {

		removeHallLoad(hp1);
		addHallLoad(hp2);
	}

	public ArrayList<HallLoadPO> getHallLoadList() {
		try {
			FileInputStream fis = new FileInputStream("HallLoad.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallLoadPO> upl = (ArrayList<HallLoadPO>) ois.readObject();
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
