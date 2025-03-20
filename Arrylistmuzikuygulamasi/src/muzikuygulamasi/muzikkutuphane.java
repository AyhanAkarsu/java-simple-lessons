package muzikuygulamasi;

import java.util.ArrayList;
import java.util.Scanner;

public class muzikkutuphane {
	private ArrayList<String> mliste = new ArrayList<>();
	
	public void SarkilariBastir() {
		System.out.println("Sarki sayisi: "+mliste.size());
		for(int i=0;i<mliste.size();i++) {
		if(mliste.size() > 0) {
			System.out.println((i+1)+"."+mliste.get(i));
		}
		if(mliste.size() == 0) {
			System.out.println("Liste bos");
	}
		}
	}
	public void MuzikEkle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklemek istediginiz sarki adini giriniz: ");
		String ekle = scanner.nextLine();
		mliste.add(ekle);
		System.out.println("Sarki basarili bir sekilde eklendi");
	}
	public void SarkiGuncelle() {
		SarkilariBastir();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guncellemek istediginiz sarkici numarasini giriniz: ");
		int sec = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Guncellemek istediginiz sarkiyi giriniz: ");
	    String gsarki = scanner.nextLine();
	    mliste.set((sec-1), gsarki);
	    System.out.println("Basarili bir sekilde guncellendi....");
	}
    public void SarkiSil() {
    	SarkilariBastir();
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Silmek istediginiz sarki numarasiniz giriniz: ");
    	int sec = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Sarkiyi silmek istediginizden eminmisiniz(E/H)..");
    	String emin = scanner.nextLine();
    	if(emin.equals(emin)) {
    	mliste.remove((sec-1));
    	System.out.println("Sarki basari bir sekilde silindi..");
    	}
    	if(emin.equals(emin)) {
    		System.out.println("Sarki silinmedi..");
    	}
    }
    public void SarkiAra() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Bulmak istediginiz sarki adini giriniz: ");
    	String ad = scanner.nextLine();
    	mliste.indexOf(ad);
    	if(mliste.indexOf(ad) >= 0) {
    		System.out.println("Sarki bulundu...");
    		System.out.println( (mliste.indexOf(ad)+1)+"."+mliste.get(mliste.indexOf(ad)));
    	}
    	else {
			System.out.println("Boyle bir sarki yok...");
		}
    }
}

