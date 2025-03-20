import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Deneme.txt")))
	{
		bufferedWriter.write("Deneme 123\n"
				+ "deneme 321\n"
				+ "deneme 33454");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("Deneme.txt"))))
	{
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
	}
	}

}
