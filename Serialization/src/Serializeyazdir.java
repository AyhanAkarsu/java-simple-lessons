import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializeyazdir {

	public static void main(String[] args) {
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ogrencibilgi.bin")))
		{
			OBilgi oBilgi = new OBilgi("Ayhan", 3054, "EEM");
			OBilgi oBilgi2 = new OBilgi("Ace", 3020, "EEM");
			output.writeObject(oBilgi);
			output.writeObject(oBilgi2);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi..");
		} catch (IOException e) {
			System.out.println("IOException hatasi...");
		}

	}

}
