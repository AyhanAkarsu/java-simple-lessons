import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializeoku {

	public static void main(String[] args) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrencibilgi.bin")))
		{
			OBilgi oBilgi = (OBilgi)in.readObject();
			OBilgi oBilgi2 = (OBilgi)in.readObject();
			System.out.println(oBilgi2);
			System.out.println(oBilgi);
		} catch (FileNotFoundException e) {
		System.out.println("Dosya bulunamadi..");
		} catch (IOException e) {
			System.out.println("IOException hatasi...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 }

}
