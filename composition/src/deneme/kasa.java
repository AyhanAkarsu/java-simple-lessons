package deneme;

import org.w3c.dom.ls.LSOutput;

public class kasa {
	private String model;
	private String marka;
	private int yil;

	
	
	public kasa(String model,String marka,int yil) {
		this.model = model;
		this.marka = marka;
		this.yil = yil;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public int getYil() {
		return yil;
	}



	public void setYil(int yil) {
		this.yil = yil;
	}

	public void kasaac() {
		System.out.println("Kasa aciliyor");
	}
	
	
}
