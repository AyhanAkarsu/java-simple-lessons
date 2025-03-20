package interfacedeneme;

public class kullanicilar {
private String kullaniciadi;
private int yas;
public String getKullaniciadi() {
	return kullaniciadi;
}
public kullanicilar(String kullaniciadi, int yas) {
	this.kullaniciadi = kullaniciadi;
	this.yas = yas;
}
public void setKullaniciadi(String kullaniciadi) {
	this.kullaniciadi = kullaniciadi;
}
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}
}
