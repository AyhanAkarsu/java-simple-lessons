import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class main {
private static ArrayList<Integer> tut = new ArrayList<Integer>();
private static ArrayList<Integer> tut2 = new ArrayList<Integer>();
public static void okuma() {
	try {
		FileInputStream dosya1 = new FileInputStream("op.mp3");
		FileInputStream dosya2 = new FileInputStream("kk.mp3");
		int deger1;
		int deger2;
		while((deger1 = dosya1.read()) != -1) {
			tut.add(deger1);
		}
		while((deger2 = dosya2.read()) != -1) {
			tut2.add(deger2);
	} 
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	public static void main(String[] args) {
		okuma();
	    kopyala();
		

	}
	private static void kopyala() {
		try {
			FileOutputStream kopya = new FileOutputStream("kkop.mp3");
			//1344465
			//2817711
		for (Integer integer : tut2) {
			kopya.write(integer);
		}
		for (Integer integer : tut) {
			kopya.write(integer);
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
