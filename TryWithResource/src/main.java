import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try(FileWriter deneme = new FileWriter("deneme.txt");
				FileWriter deneme2 = new FileWriter("deneme2.txt")){
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("Dil giriniz..");
				String dilS = scanner.nextLine();
				if(dilS.endsWith("-1")) {
					System.out.println("Cikis yapiliyor...");
					break;
				}
				System.out.println("kaydedilecek dosya hangisi: ");
				String secim = scanner.nextLine();
				if(secim.equals("1")) {
					deneme.write(dilS);
				}
				else {
					deneme2.write(dilS);
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
