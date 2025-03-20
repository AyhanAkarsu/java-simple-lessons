import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClassFilmListesi {
public class FilmListe implements Iterable<String>{
public class filmliste implements Iterator<String>{
private int indeks = 0;
	@Override
	public boolean hasNext() {
		if(indeks > Film_Listesi.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public String next() {
	     String tutString = Film_Listesi.get(indeks);
	     indeks ++;
	     return tutString;
	}
}
	@Override
	public Iterator<String> iterator() {
		
		return new filmliste();
	}
}

private List<String> Film_Listesi = new ArrayList<String>();
public void FilmEkle(String ekle) {
	Film_Listesi.add(ekle);
	System.out.println("Eklenen film: "+ekle);
}

public int kanal_sayisi() {
	return Film_Listesi.size();
}

public void FilmCikar(String cikar) {
	if(Film_Listesi.contains(cikar)) {
		Film_Listesi.remove(cikar);
		System.out.println("Cikarilan film: "+cikar);
	}
	else {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Girilen isimde film bulunamadi");
	System.out.println("*********************");
		System.out.println("Film adini hatirlayamadiysaniz menuye donmek icin 1'e\n"
				+ "Filmleri listelemek icin 2'ye basin.\n"
				+ "Tekrar film cikarmak icin 3'e basin");
		System.out.println("************************");
		String sec12 = scanner.nextLine();
		switch(sec12) {
		case "1" : 
			break;
		case "2" :
			FilmleriGoster();
			break;
		case "3" :
			System.out.println("Cikarmak istediginiz filmi tekrar giriniz: ");
			String tekrar = scanner.nextLine();
			FilmCikar(tekrar);
		}
	}
}

public void FilmleriGoster() {
	if(kanal_sayisi() == 0) {
		System.out.println("Hic film bulunmamaktadir.");
	}
	else {
		for (String string : Film_Listesi) {
			System.out.println(string);
		}
	}	
}
}
