package interfacedeneme;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class kullaniciYoneticisi {
	private interfacee interfacee;
	public kullaniciYoneticisi(interfacedeneme.interfacee interfacee) {
		this.interfacee = interfacee;
	}
	public void kullanici(kullanicilar kullanici) {
		yaskontrol ykontrol = new yaskontrol();
		if(interfacee.kontrol(kullanici)) {
		System.out.println("Kullanici basarili bir sekilde kayit oldu: "+kullanici.getKullaniciadi());
	}
		else {
			System.out.println("kayit olunamadi");
		}

}
}
