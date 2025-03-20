import java.net.SocketTimeoutException;
import java.util.Scanner;

public class main {
	private static Kart[][] kartlar = new Kart[4][4];
	public static void oyunalani() {	
		System.out.println("***************Oyun Alani*********");
		System.out.println("-------------------");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(kartlar[i][j].getTahminsonuc() == true) {
					System.out.println(" |"+kartlar[i][j].getTahmin()+"| ");
				}
				else {
					System.out.print("*| |*");
				
				}
			}
			System.out.println("");}
		System.out.println("-------------------");
		
	}
	public static boolean oyunsonu() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(kartlar[i][j].getTahminsonuc() == false) {
					return false;
				}
			}
		}
		return true;
		
		
	}
	public static void oyna() {
		System.out.println("secim icin indeks numaralarini giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		kartlar[i][j].setTahminsonuc(true);
		oyunalani();
		System.out.println("secim 2 icin indeks numaralarini giriniz: ");
		int ii = scanner.nextInt();
		int jj = scanner.nextInt();
		kartlar[ii][jj].setTahminsonuc(true);
		oyunalani();
		if(kartlar[i][j].getTahmin()!=kartlar[ii][jj].getTahmin()) {
			kartlar[i][j].setTahminsonuc(false);
			kartlar[ii][jj].setTahminsonuc(false);
			System.out.println("Eslesme yanlis...");
		}
		else {
				System.out.println("Eslesme dogru...");
			}
		}
	public static void main(String[] args) {
	kartlar[0][0] = new Kart('E'); 
	kartlar[0][1] = new Kart('A');
	kartlar[0][2] = new Kart('B');
	kartlar[0][3] = new Kart('F');
	kartlar[1][0] = new Kart('G');
	kartlar[1][1] = new Kart('A');
	kartlar[1][2] = new Kart('D');
	kartlar[1][3] = new Kart('H');
	kartlar[2][0] = new Kart('F');
	kartlar[2][1] = new Kart('C');
	kartlar[2][2] = new Kart('D');
	kartlar[2][3] = new Kart('H');
	kartlar[3][0] = new Kart('H');
	kartlar[3][1] = new Kart('G');
	kartlar[3][2] = new Kart('B'); 
	kartlar[3][3] = new Kart('C');
while(oyunsonu() == false) {
oyunalani();
oyna();
}
}
}
