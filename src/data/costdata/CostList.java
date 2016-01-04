package data.costdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.costPO.CostPO;

@SuppressWarnings("serial")
public class CostList implements Serializable {
	public CostPO getCostPO(CostPO cp) {
		try {
			FileInputStream fis = new FileInputStream("Cost.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CostPO> upl = (ArrayList<CostPO>) ois.readObject();
			for (CostPO po : upl) {
				if (po.getAccount().equals(cp.getAccount())) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Cost.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<CostPO> cpl = new ArrayList<CostPO>();
				cpl.add(cp);
				os.writeObject(cpl);
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
	public void addCost(CostPO cp) {
		try {
			FileInputStream fis = new FileInputStream("Cost.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CostPO> upl = (ArrayList<CostPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("Cost.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Cost.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<CostPO> cpl = new ArrayList<CostPO>();
				cpl.add(cp);
				os.writeObject(cpl);
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

	public void removeCost(CostPO cp) {
		try {
			FileInputStream fis = new FileInputStream("Cost.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CostPO> upl = (ArrayList<CostPO>) ois.readObject();
			CostPO a = null;
			for (CostPO po : upl) {
				if (po.getAccount().equals(cp.getAccount())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Cost.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Cost.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<CostPO> cpl = new ArrayList<CostPO>();
				cpl.add(cp);
				os.writeObject(cpl);
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

	public void changeCost(CostPO cp1, CostPO cp2) {

		removeCost(cp1);
		addCost(cp2);
	}

	public ArrayList<CostPO> getCostList() {
		try {
			FileInputStream fis = new FileInputStream("Cost.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CostPO> upl = (ArrayList<CostPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Cost.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<CostPO> cpl = new ArrayList<CostPO>();
				os.writeObject(cpl);
				os.close();
				return cpl;
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
