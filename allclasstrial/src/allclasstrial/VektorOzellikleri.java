package allclasstrial;

import java.util.Scanner;

public class VektorOzellikleri {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public VektorOzellikleri(String isim) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vektorun degerlerini giriniz..");
		System.out.println("Ilk parametre: ");
		int x = scanner.nextInt();
		System.out.println("Ikinci parametre: ");
		int y = scanner.nextInt();
		System.out.println("Ucuncu parametre: ");
		int z = scanner.nextInt();
		scanner.nextLine();
		this.a = x;
		this.b = y;
		this.c = z;
}
}
