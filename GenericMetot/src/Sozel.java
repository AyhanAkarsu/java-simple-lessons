
public class Sozel extends Aday{

	public Sozel(int matamatik, int fen, int turkce, int sosyal,String isim) {
		super(matamatik, fen, turkce, sosyal,isim);
	}

	@Override
	public int puanhesapla() {
int sozel_puan = getFen()*1 + getMatamatik()*2 + getSosyal()*4 + getTurkce()*4;
return sozel_puan;
	}
}
