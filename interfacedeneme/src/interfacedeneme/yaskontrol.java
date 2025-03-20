package interfacedeneme;

import java.io.DataOutput;

public class yaskontrol implements interfacee{

	@Override
	public boolean kontrol(kullanicilar kullanici) {
		if(kullanici.getYas() >= 18) {
			System.out.println("Basarili bir sekilde kayit olundu");
			return true;
		}
		else {
			System.out.println("18 yasindan kucukler kayit olamaz");
			return false;
		}
	}

}
