import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {	
		yazma.yazma();
		try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt")))
		{
			/*while(scanner.hasNext())
			{
				System.out.println(scanner.nextLine());
			}*/
			System.out.println("************************");
			
			while(scanner.hasNextLine())
			{
				String ogrenci_bilgi = scanner.nextLine();
				String[] array = ogrenci_bilgi.split(", ");
				if(array[1].equals("EEM"))
				{
					System.out.println(ogrenci_bilgi);
				}
				
		
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya acilamadi.");
			e.printStackTrace();
		}

	}

}
