package interfacedeneme;

public class isimkontrol implements interfacee {

	@Override
	public boolean kontrol(kullanicilar kullanici) {
		if(kullanici.getKullaniciadi().equals("Ayhan Akarsu")) {
			System.out.println("Kayit olundu");
			return true;
		}
		else {
			System.out.println("Kayit olunamadi");
			return false;
		}
	}
}
