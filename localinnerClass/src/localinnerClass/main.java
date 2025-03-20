package localinnerClass;

import java.security.PublicKey;

public class main {

	public static void main(String[] args) {
		
		class alan{
			public static void daire(int sayi) {
				System.out.println("Dairenin alani: "+sayi*Math.PI);
			}
			public void kare(int sayi2) {
				System.out.println("Karenin alani: "+sayi2*sayi2);
			}
		class cevre{
			public static void karecevre(int s) {
				System.out.println("Karenin cevresi: "+4*s);
			}
			public void dortgencevre(int a,int b) {
				System.out.println("Dortgenin cevresi: "+2*(a+b));
			}
		}
		}
		alan alanhesap = new alan();
		alan.daire(3);
		alanhesap.kare(4);
		alan.cevre.karecevre(4);
		alan.cevre dorgencevre = new alan().new cevre();
		dorgencevre.dortgencevre(2,3);
	}
}
