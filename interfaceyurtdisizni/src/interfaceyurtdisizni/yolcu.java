package interfaceyurtdisizni;

import java.util.Scanner;

public class yolcu implements izinler {
	private boolean vize;
	private boolean siyasidurum;
	private int miktar;
	
	
	public yolcu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Harc miktarini giriniz..");
		this.miktar = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Herhangi sayisi yasaginiz bulunuyor mu?(Evet/Hayir): ");
	    String secim = scanner.nextLine();
	    if(secim.equals("Evet")) {
	    	this.siyasidurum = false;
	    }
	    else {
			this.siyasidurum = true;
		}
	    System.out.println("Vizeniz varmi?(Evet/Hayir): ");
	    String secim2 = scanner.nextLine();
	    if(secim.equals("Evet")) {
	    	this.vize = true;
	    }
	    else {
			this.vize = false;
		}
	}

	@Override
	public boolean yurtdisiharc() {
	if(this.miktar < 100) {
		System.out.println("Harc miktarini eksik yatirdiniz..");
		return false;
	}
	else {
		System.out.println("Harc islemi basarili bir sekilde yatirildi..");
		return true;
	}
	}

	@Override
	public boolean vizedurumu() {
		if(this.vize = true) {
			System.out.println("Vize islemleriniz tamamlanmistir...");
			return true;
		}
		else {
			System.out.println("Vize islemlerini gerceklestiriniz..");
			return false;
		}
	}

	@Override
	public boolean siyasiyasak() {
	if(this.siyasidurum == true) {
		System.out.println("Siyasi bir engeliniz bulunmamaktadir..");
		return true;
	}
	else {
		System.out.println("Siyasi engelinizden dolayi yurtdisina cikamazsiniz..");
		return false;
	}
	}
}
