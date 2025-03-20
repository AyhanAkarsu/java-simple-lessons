package ınnerclass;

import java.util.Scanner;

import ınnerclass.matematik.faktoriyel;

public class main {

	public static void main(String[] args) {
	matematik.faktoriyel faktor = new matematik().new faktoriyel();
	faktor.fak();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Asal sayi sorgusu yapilacak sayiyi giriniz..");
	int sayi = scanner.nextInt();
	matematik.Asalmi asalmi = new matematik().new Asalmi();
	if(asalmi.asalmi(sayi)) {
		System.out.println("Asal sayi...");
	}
	else {
		System.out.println("Asal sayi degildir..");
	}
	System.out.println("Dairenin yaricapini giriniz: ");
	float yaricap = scanner.nextFloat();
	System.out.println("Karenin kenar uzunlugunu giriniz: ");
	int kenar = scanner.nextInt();
	matematik.alan.daire dairealan = new matematik().new alan().new daire();
	dairealan.dairealan(yaricap);
	matematik.alan.kare karealan = new matematik().new alan().new kare();
	karealan.karealan(kenar);
	}
}
