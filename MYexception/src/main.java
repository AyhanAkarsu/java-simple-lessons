import java.util.Scanner;

public class main {
public static void Kullanici_giris(int yas) {
	if(yas < 18) {
		throw new myexpcion("Error");
	}
	else {
		System.out.println("Hosgeldiniz..");
	}
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yasinizi giriniz..");
		int yas = scanner.nextInt();
		try {
			Kullanici_giris(yas);
		}
catch (myexpcion e) {
System.out.println(e);
e.printStackTrace();
System.out.println("Yasiniz tutmuyor.");
}
	}

}
