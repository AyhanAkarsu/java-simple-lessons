import java.net.SocketTimeoutException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class overlite implements ismulakat {

	@Override
	public void askerlikDurumu() {
    System.out.println("Askerlik durumunu giriniz: (Evet/Hayir)");
	Scanner scanner = new Scanner(System.in);
	String secim = scanner.nextLine();
	if(secim == "Evet") {
		System.out.println("Askerlik yapildi");
	}
	else {
		System.out.println("Askerlik yapilmadi");
	}
		
	}

	@Override
	public void adlisicilkaydi() {
		System.out.println("Adli sicil kaydi varmi?");
		Scanner scanner = new Scanner(System.in);
		String secim = scanner.nextLine();
		if(secim == "Evet") {
			System.out.println("Adli sicil kaydi bulunmakdadir..");
		}
		else {
			System.out.println("Adli sicil kaydi bulunmamakdadir..");
		}
			
		}
	@Override
	public String[] tecrube() {
	String[] tecrube = {"Aselsan","TAI","Google"};
	for (String string : tecrube) {
		System.out.println("Tecrubelerim: "+string);
	} 
		return tecrube;
	}

	@Override
	public float mezuniyetOrtalama() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mezuniyet ortalamasini giriniz..");
		float ortlama = scanner.nextFloat();
		return ortlama;
	}

}
