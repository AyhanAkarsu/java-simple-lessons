package deneme;

import java.util.StringTokenizer;

public class anakart {
	private String model;
	private String yil;
	private String isletim;
	
public anakart(String model,String yil,String isletim) {
	this.model = model;
	this.yil = yil;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getYil() {
	return yil;
}

public void setYil(String yil) {
	this.yil = yil;
}
	
public void isletimSistemiy(String isletim) {
	this.isletim = isletim;
	System.out.println("isletim sistemi: "+isletim);
}

public String getIsletim() {
	return isletim;
}

public void setIsletim(String isletim) {
	this.isletim = isletim;
}
	
	
	
}
