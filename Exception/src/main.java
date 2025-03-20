import java.io.IOException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class main extends Exception {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		try {
			float a = 5/1;
			
		} catch (ArithmeticException a) {
			System.out.println("payda sifir olamaz..");
		}
		try {
			char[] liste = {'a','b'};
			System.out.println(liste[1]);
		}
		catch(ArrayIndexOutOfBoundsException liste) {
			System.out.println("karakter bulunamadi.");
		}
System.out.println("************");
System.out.println("Yas girriniz: ");
Scanner scanner = new Scanner(System.in);
int yas = scanner.nextInt();
throwss dogrula = new throwss();
try {
	dogrula.giris(yas);
}
catch (ArithmeticException e) {
	System.out.println("18 den kucukler giremez.");
}
throwss d2 = new throwss();
System.out.println("************************");
System.out.println("Yasinizi giriniz: ");
int yas2 = scanner.nextInt();
try {
	dogrula.giris2(yas2);
}
catch (IOException ex) {
	System.out.println("18 den kucukler giremez.");
}
	}

}
