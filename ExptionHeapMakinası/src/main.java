import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
class CarpmaHata extends IndexOutOfBoundsException{
public static void carpma(int a, int b) {
	if(a > 10000 && b > 10000) {
		throw new CarpmaHata();
	}
}
	@Override
	public void printStackTrace() {
	System.out.println("Carpma islemi icin girilen sayilar cok buyuk..");
	}
	
}
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Yapmak istediginiz islemi seciniz..");
	try {
		int secim = scanner.nextInt();
	switch(secim) {
		case 1:
			System.out.println("toplamak istediginiz iki sayiyi giriniz: ");
			int s1 = scanner.nextInt();
			int s2 = scanner.nextInt();
			System.out.println(s1+s2);
			break;
		case 2:
			System.out.println("Cikarmak istediginiz iki sayiyi giriniz: ");
			int s3 = scanner.nextInt();
			int s4 = scanner.nextInt();
			System.out.println(s3-s4);
		case 3:
			System.out.println("Carpmak istediginiz iki sayiyi giriniz: ");
			int s5 = scanner.nextInt();
			int s6 = scanner.nextInt();
			CarpmaHata.carpma(s5, s6);
			System.out.println(s5*s6);
		case 4:
			System.out.println("Bolmek istediginiz iki sayiyi giriniz: ");
			int s7 = scanner.nextInt();
			int s8 = scanner.nextInt();
			System.out.println(s7/s8);
	}
	}
	catch (ArithmeticException e) {
		System.out.println("Pay sifira bolunemez.");
	}
	catch (InputMismatchException e) {
		System.out.println("integer bir sayi giriniz.");
	}
	catch (CarpmaHata e) {
		e.printStackTrace();
	}
	}
}
