package allclasstrial;

import java.util.Scanner;

public class MatematikveFizikp {
	public static class Mat{
		public static void daireAlan(int yaricap) {
			System.out.println("Dairenin yaricapini giriniz...");
			Scanner scanner = new Scanner(System.in);
			yaricap = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Dairenin Alani: "+yaricap*Math.PI );
		}
		public static void UcgenCevre(int a,int b,int c) {
			System.out.println("Ucgenin cevresi: "+(a+b+c));
		}
	}
	public static class fizik{
		public static void VektorCarpim(VektorOzellikleri vek1,VektorOzellikleri vek2) {
			int iccarpim = vek1.getA()*vek2.getA() + vek1.getB()*vek2.getB() + vek1.getC()*vek2.getC();
			System.out.println("Vektorlerin ic carpimi: "+iccarpim);
		}
	}
}
