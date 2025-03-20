import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class main {

	public static void main(String[] args) {
	String menu = "1- Sayisal birinci puan hesapla\n"
			+ "2- Sozel birinci puan hesapla\n"
			+ "3- Menuyu tekrar goster";
			
	System.out.println(menu);
	while(true)
	{
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cikis icin 4'e basiniz..");
		System.out.println("Seciminizi yapiniz: ");
		int secim = scanner.nextInt();
		if(secim == 4) {
			System.out.println("Cikis yapildi..");
			break;
		}
		System.out.println("1.ogrencinin ismini giriniz: ");
		String iiString = scanner.nextLine();
		scanner.nextLine();
		System.out.println("1. ogrenci icin netleri giriniz..");
		System.out.println("Matematik: ");
		int mat = scanner.nextInt();
		System.out.println("Fen: ");
		int fen = scanner.nextInt();
		System.out.println("Turkce: ");
		int turkce = scanner.nextInt();
		System.out.println("Sosyal: ");
		int sosyal = scanner.nextInt();
		scanner.nextLine();
		System.out.println("2.ogrencinin ismini giriniz: ");
		String iiiString = scanner.nextLine();
		System.out.println("2. ogrenci icin netleri giriniz..");
		System.out.println("Matematik: ");
		int mat2 = scanner.nextInt();
		System.out.println("Fen: ");
		int fen2 = scanner.nextInt();
		System.out.println("Turkce: ");
		int turkce2 = scanner.nextInt();
		System.out.println("Sosyal: ");
		int sosyal2 = scanner.nextInt();
		scanner.nextLine();
		if(secim == 1) {
			Sayisal sayisal1 = new Sayisal(mat, fen, turkce, sosyal, iiString);
			Sayisal sayisal2 = new Sayisal(mat2, fen2, turkce2, sosyal2, iiiString);
			System.out.println("Sayisal da 1.ogrenci "+birinci(sayisal1,sayisal2).getIsim());
			System.out.println("Birinci ogrencinin puani: "+birinci(sayisal1,sayisal2).puanhesapla());
		}
		else if(secim == 2) {
			Sozel sozel1 = new Sozel(mat, fen, turkce, sosyal, iiString);
			Sozel sozel2 = new Sozel(mat2, fen2, turkce2, sosyal2, iiiString);
			System.out.println("Sozel de 1.ogrenci "+birinci(sozel1,sozel2).getIsim());
			System.out.println("Birinci ogrencinin puani: "+birinci(sozel1,sozel2).puanhesapla());
		}
		else if(secim == 3) {
			System.out.println(menu);
		}
	}
	}

public static <E extends Aday> E birinci(E s1,E s2) {
	if(s1.puanhesapla() > s2.puanhesapla())
	{
		return s1;
	}
	else {
		return s2;
	}
}
}
