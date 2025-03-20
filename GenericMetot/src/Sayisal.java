
public class Sayisal extends Aday {

	public Sayisal(int matamatik, int fen, int turkce, int sosyal,String isim) {
		super(matamatik, fen, turkce, sosyal,isim);
	}

	@Override
	public int puanhesapla() {
int sayisalpuan = getFen()*4 + getMatamatik()*4 + getSosyal()*1 + getTurkce()*2;
return sayisalpuan;
	}
}
