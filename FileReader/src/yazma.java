import java.io.FileWriter;
import java.io.IOException;

public class yazma {
public static void yazma()
{
	FileWriter yaz = null;
	try {
		yaz = new FileWriter("Ogrenciler.txt");
		yaz.write("Ayhan Akarsu, EEM\n"
				+ "Ace Hikken, BM\n"
				+ "Shank Akagami, EEM");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			yaz.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
