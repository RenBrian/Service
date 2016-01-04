package data.stratedarddata.standarddata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.stratedardPO.StandardPO;

@SuppressWarnings("serial")
public class StandardList implements Serializable {
	public StandardPO getStandardPO(StandardPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Standard.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StandardPO> upl = (ArrayList<StandardPO>) ois.readObject();
			for (StandardPO po : upl) {
				if (po == sp) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Standard.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<StandardPO> spl = new ArrayList<StandardPO>();
				spl.add(sp);
				os.writeObject(spl);
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
	public void addStandard(StandardPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Standard.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<StandardPO> upl = (ArrayList<StandardPO>) ois.readObject();
			upl.add(sp);
			FileOutputStream fs = new FileOutputStream("Standard.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Standard.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<StandardPO> spl = new ArrayList<StandardPO>();
				spl.add(sp);
				os.writeObject(spl);
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

	public void removeStandard(StandardPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Standard.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StandardPO> upl = (ArrayList<StandardPO>) ois.readObject();
			StandardPO a = null;
			for (@SuppressWarnings("unused")
			StandardPO po : upl) {
				// if (po.getName().equals(sp.getName())) {
				// a = sp;
				// }
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Standard.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Standard.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<StandardPO> spl = new ArrayList<StandardPO>();
				spl.add(sp);
				os.writeObject(spl);
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

	public void changeAccount(StandardPO sp1, StandardPO sp2) {

		removeStandard(sp1);
		addStandard(sp2);
	}

	public ArrayList<StandardPO> getStandardList() {
		try {
			FileInputStream fis = new FileInputStream("Standard.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StandardPO> upl = (ArrayList<StandardPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Standard.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<StandardPO> spl = new ArrayList<StandardPO>();
				os.writeObject(spl);
				os.close();
				return spl;
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
