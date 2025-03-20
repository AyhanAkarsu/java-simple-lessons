package ınnerstaticclass;

public class matematik {
private static double PI = Math.PI;

public static class alan{
	public static void kare(int sayi) {
		System.out.println("Karenin alani: "+sayi*sayi);
	}
	public static void daire(int yaricap) {
		System.out.println("Dairenin alani: "+yaricap*yaricap*PI);
	}
}
}
