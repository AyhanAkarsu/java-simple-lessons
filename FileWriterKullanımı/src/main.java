import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		FileWriter yazma = null;
		try {
			yazma = new FileWriter("deneme.txt");
			yazma.write("Deneme yazisi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(yazma != null) {
				try {
					yazma.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
