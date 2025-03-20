import javax.management.loading.PrivateClassLoader;

public abstract class Aday {
	private int Matamatik;
	private int Fen;
	private int Turkce;
	private int Sosyal;
	private String isim;
	public int getTurkce() {
		return Turkce;
	}
	public void setTurkce(int turkce) {
		Turkce = turkce;
	}
	public int getSosyal() {
		return Sosyal;
	}
	public void setSosyal(int sosyal) {
		Sosyal = sosyal;
	}
	public int getMatamatik() {
		return Matamatik;
	}
	public void setMatamatik(int matamatik) {
		Matamatik = matamatik;
	}
	public int getFen() {
		return Fen;
	}
	public void setFen(int fen) {
		Fen = fen;
	}
	public Aday(int matamatik, int fen, int turkce, int sosyal,String isim) {
		Matamatik = matamatik;
		Fen = fen;
		Turkce = turkce;
		Sosyal = sosyal;
		this.isim = isim;
	}
abstract int puanhesapla();
public String getIsim() {
	return isim;
}
}
