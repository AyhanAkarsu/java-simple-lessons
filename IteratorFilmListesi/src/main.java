import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassFilmListesi Film_Listesi = new ClassFilmListesi();
		System.out.println("************");
	String islemler = "1-) Film ekle\n"
			+ "2-) Film cikar\n"
			+ "3-) Film sayisini goster\n"
			+ "4-) Filmleri goster\n"
			+ "5-) Menuyu goster\n"
			+ "6-) Cikis";
System.out.println(islemler);
System.out.println("****************");
while(true) {
System.out.println("Yapacaginiz islemi seciniz: ");
String islem = scanner.nextLine();
if(islem.equals("1")) {
	System.out.println("Eklemek istediginiz filmi giriniz: ");
	String ekle = scanner.nextLine();
	Film_Listesi.FilmEkle(ekle);
}
else if(islem.equals("2")) {
	System.out.println("Cikarmak istediginiz filmi giriniz: ");
	String sil = scanner.nextLine();
	Film_Listesi.FilmCikar(sil);
}
else if(islem.equals("3")) {
	System.out.println("Film sayisi:" + Film_Listesi.kanal_sayisi());;
}
else if(islem.equals("4")) {
	Film_Listesi.FilmleriGoster();
}
else if(islem.equals("5")) {
	System.out.println(islemler);
}
else if(islem.equals("6")) {
	break;
}
else {
	System.out.println("Lutfen dogru islemi seciniz: ");
	System.out.println(islemler);
}
}
	}
}
