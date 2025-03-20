import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.kare alan hesabi\n"
				+ "2.Daire alan hesabi\n"
				+ "3.Ucgen alan hesabi\n"
				+ "4.Cikis\n");
		boolean durum = true;
while(durum) {
	System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
	int secim = scanner.nextInt();
	scanner.nextLine();
	switch(secim) {
	case(1):
		System.out.println("Karenin kenar uzunlugunu giriniz: ");
	int kenar = scanner.nextInt();
	scanner.nextLine();
	kare karealan = new kare("Kare", kenar);
	karealan.alanhesapla();
	break;
	case(2):
		System.out.println("Dairenin yaricapini giriniz: ");
	int  yaricap = scanner.nextInt();
	scanner.nextLine();
	daire daieralan = new daire("Daire", yaricap);
	daieralan.alanhesapla();
	break;
	case(3):
		System.out.println("Ucgenin kenar uzunluklarini giriniz..");
	System.out.println("Kenar 1: ");
	int kenar1 = scanner.nextInt();
	System.out.println("Kenar2: ");
	int kenar2 = scanner.nextInt();
	System.out.println("Kenar3");
	int kenar3 = scanner.nextInt();
	scanner.nextLine();
	Ucgen ucgenalan = new Ucgen("Ucgen", kenar1, kenar2, kenar3);
	ucgenalan.alanhesapla();
	break;
	case(4):
		durum = false;
	break;
	}
	
}
	}

}
