package muzikuygulamasi;

import java.util.Scanner;

public class main {
	public static void arayuz() {
		System.out.println(
				"*************************\n"+
				  "Sarkilari Bastir ---->1\n"
				+ "Sarki Ekle----------->2\n"
				+ "Sarki Guncelle------->3\n"
				+ "Sarki Sil------------>4\n"
				+ "Sarki Ara------------>5\n"
				+ "Cikis---------------->6\n"
				+ "*************************");		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		muzikkutuphane Muzikkutuphane = new muzikkutuphane();
	boolean durum = true;
	while(durum == true) {
	arayuz();
	System.out.println("Seciminizi yapiniz: ");
	int secim = scanner.nextInt();
	scanner.nextLine();
	switch(secim) {
	case 1:
		Muzikkutuphane.SarkilariBastir();
		break;
	case 2:
		Muzikkutuphane.MuzikEkle();
		break;
	case 3:
		Muzikkutuphane.SarkiGuncelle();
		break;
	case 4:
		Muzikkutuphane.SarkiSil();
		break;
	case 5:
		Muzikkutuphane.SarkiAra();
		break;
	case 6:
		durum = false;
		System.out.println("Cikis yapiliyor....");
		break;
	}	
	}
	}
}
