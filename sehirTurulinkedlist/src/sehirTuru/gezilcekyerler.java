package sehirTuru;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class gezilcekyerler {
public static void bastir() {
	System.out.println("Yapilacak islemi seciniz...\n"
			+ "Bir sonraki sehre git----->1\n"
			+ "Bir onceki sehre git------>2\n"
			+ "Cikis--------------------->3\n");
}
public static void sehirTuru(LinkedList<String> sehirler) {
ListIterator<String> iterator = sehirler.listIterator();
bastir();
boolean durum = true;
if(!iterator.hasNext()) {
	System.out.println("Gidilecek sehir yok....");
}
Scanner scanner = new Scanner(System.in);
boolean ig = true;
while(durum) {
	int secim = scanner.nextInt();
	switch(secim) {
	case 1:
		if(ig==false) {
			if(iterator.hasNext()) {
				iterator.hasNext();
			}
			ig = true;
		}
	    if(iterator.hasNext()) {
			System.out.println("Bir sonraki sehir" + iterator.next());
		}
		else {
			System.out.println("Gidilecek sehir kalmadi...");
			ig = true;
		}
		break;
	case 2:
		if(ig==true) {
			if(iterator.hasPrevious()) {
				iterator.hasPrevious();
			}
			ig = false;
		}
		if (iterator.hasPrevious()) {
			System.out.println("Bir onceki sehir "+ iterator.previous());
		}
		else {
			System.out.println("Sehir turu basladi...");
		}
		break;
	case 3:
		durum = false;
		System.out.println("Cikis yapiliyor..");
		break;
	}
}
}
	public static void main(String[] args) {
		LinkedList<String> sehirler = new LinkedList<String>();
		sehirler.add(" Istanbul");
		sehirler.add(" Izmir");
		sehirler.add(" Bursa");
		sehirler.add(" Antalya");
		sehirTuru(sehirler);		
	}

}
