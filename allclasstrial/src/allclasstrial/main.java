package allclasstrial;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String islemler = "1.Daire alani\n"
				+ "2.Ucgen cevresi\n"
				+ "3. 3 boyutlu vektorlerin ic carpimi\n"
				+ "Cikis icin q ye basin";
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(islemler);
			System.out.println("Yapmak istediginiz islemi seciniz...");
			String secim = scanner.nextLine();
			if(secim.equals("q")) {
				System.out.println("Cikis yapiliyor...");
				break;
			}
			else if(secim.equals("1")) {
				MatematikveFizikp.Mat.daireAlan(0);
			}
			else if(secim.equals("2")) {
				System.out.println("Ucgen cevresi hesabi icin kenar uzunluklarini giriniz..");
				System.out.println("1.kenar: ");
				int a = scanner.nextInt();
				System.out.println("2.kenar: ");
				int b = scanner.nextInt();
				System.out.println("3.kenar");
				int c = scanner.nextInt();
				MatematikveFizikp.Mat.UcgenCevre(a, b, c);
			}
			else if(secim.equals("3")) {
				System.out.println("Vektor 1");
				VektorOzellikleri ozellik = new VektorOzellikleri("Vektor1");
				System.out.println("Vektor 2");
				VektorOzellikleri ozellik2 = new VektorOzellikleri("Vektor2");
				MatematikveFizikp.fizik.VektorCarpim(ozellik, ozellik2);
			}
			else {
				System.out.println("Gecersiz islem..");
			}
		}
	}
}
