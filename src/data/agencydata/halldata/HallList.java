package data.agencydata.halldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.agencyPO.HallPO;

@SuppressWarnings("serial")
public class HallList implements Serializable {
	public HallPO getHallPO(HallPO hp) {
		try {
			FileInputStream fis = new FileInputStream("Hall.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallPO> upl = (ArrayList<HallPO>) ois.readObject();
			for (HallPO po : upl) {
				if (po.getID().equals(hp.getID())) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Hall.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<HallPO> hpl = new ArrayList<HallPO>();
				hpl.add(hp);
				os.writeObject(hpl);
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
	public void addHall(HallPO hp) {
		try {
			FileInputStream fis = new FileInputStream("Hall.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<HallPO> upl = (ArrayList<HallPO>) ois.readObject();
			upl.add(hp);
			FileOutputStream fs = new FileOutputStream("Hall.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Hall.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<HallPO> hpl = new ArrayList<HallPO>();
				hpl.add(hp);
				os.writeObject(hpl);
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

	public void removeHall(HallPO hp) {
		try {
			FileInputStream fis = new FileInputStream("Hall.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallPO> upl = (ArrayList<HallPO>) ois.readObject();
			HallPO a = null;
			for (HallPO po : upl) {
				if (po.getID().equals(hp.getID())) {
					a = hp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Hallt.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Hall.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<HallPO> hpl = new ArrayList<HallPO>();
				hpl.add(hp);
				os.writeObject(hpl);
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

	public void changeHall(HallPO hp1, HallPO hp2) {

		removeHall(hp1);
		addHall(hp2);
	}

	public ArrayList<HallPO> getHallList() {
		try {
			FileInputStream fis = new FileInputStream("Hall.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<HallPO> upl = (ArrayList<HallPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Hall.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<HallPO> hpl = new ArrayList<HallPO>();
				os.writeObject(hpl);
				os.close();
				return hpl;
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
