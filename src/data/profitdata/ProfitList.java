package data.profitdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.profitPO.ProfitPO;

@SuppressWarnings("serial")
public class ProfitList implements Serializable {
	public ProfitPO getProfitPO(ProfitPO pp) {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			for (ProfitPO po : upl) {
				if (po == pp) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Profit.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<ProfitPO> ppl = new ArrayList<ProfitPO>();
				ppl.add(pp);
				os.writeObject(ppl);
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
	public void addProfit(ProfitPO pp) {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			upl.add(pp);
			FileOutputStream fs = new FileOutputStream("Profit.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Profit.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<ProfitPO> ppl = new ArrayList<ProfitPO>();
				ppl.add(pp);
				os.writeObject(ppl);
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

	public void removeProfit(ProfitPO pp) {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			ProfitPO a = null;
			for (@SuppressWarnings("unused")
			ProfitPO po : upl) {
				// if (po.getName().equals(pp.getName())) {
				// a = pp;
				// }
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Profit.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Profit.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<ProfitPO> ppl = new ArrayList<ProfitPO>();
				ppl.add(pp);
				os.writeObject(ppl);
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

	public void changeAccount(ProfitPO pp1, ProfitPO pp2) {

		removeProfit(pp1);
		addProfit(pp2);
	}

	public ArrayList<ProfitPO> getProfitList() {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Profit.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<ProfitPO> ppl = new ArrayList<ProfitPO>();
				os.writeObject(ppl);
				os.close();
				return ppl;
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
