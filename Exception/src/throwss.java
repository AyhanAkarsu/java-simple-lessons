import java.io.IOException;
import java.security.PublicKey;

public class throwss{
public void giris(int a) throws Exception {
	if(a < 18) {
		throw new ArithmeticException();
	}
	else {
		System.out.println("Hosgeldiniz..");
	}
}
public void giris2(int yass) throws IOException{
	if(yass < 20) {
		throw new IOException();
	}
	else {
		System.out.println("Hosgeldiniz.");
	}
}

}
