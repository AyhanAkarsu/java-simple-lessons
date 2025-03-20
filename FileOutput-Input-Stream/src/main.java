import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.BYTE_ARRAY;

public class main {

	public static void main(String[] args) {
		FileOutputStream file = null; 
		try {
			file = new FileOutputStream("Dosya.txt",true);
			String i = " Ayhan Akarsu";
			byte[] ii = i.getBytes();
			file.write(ii);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileInputStream file2 = null;
		System.out.println("***************************");
		try {
			file2 = new FileInputStream("Dosya.txt");
			int d;
			String tut = "";
			while((d = file2.read()) != -1) {
				tut += (char) d;
			}
			System.out.println(tut);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				file2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
