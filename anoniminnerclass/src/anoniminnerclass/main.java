package anoniminnerclass;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
			
	Iogrenci ogrenci = new Iogrenci() {
		
		@Override
		public void derseGit() {
			System.out.println("Derse gidiliyor...");	
		}
		@Override
		public void dersCalis() {
			System.out.println("Ders calisiliyor...");
		}
	};
	
	ogrenci.dersCalis();
	ogrenci.derseGit();
	System.out.println("***********************************");
	
	OgrenciBilgi bilgi = new OgrenciBilgi("Ayhan Akarsu",120) {
		
		@Override
		void bilgiAl() {
			System.out.println("Ogrenci bilgileri: "+getIsim()+" "+getNum());
		}
	};
	
	bilgi.bilgiAl();
	bilgi.merhabade();
	
	}

public interface Iogrenci{
	void dersCalis();
	void derseGit();
}

public static abstract class OgrenciBilgi{	
	private String isim;
	private int num;
	
	abstract void bilgiAl();
	public OgrenciBilgi(String isim, int num) {
		this.isim = isim;
		this.num = num;
	}
	public void merhabade() {
		System.out.println("Merhaba: ");
	}
	public String getIsim() {
		return isim;
	}
	public int getNum() {
		return num;
	}
}
}