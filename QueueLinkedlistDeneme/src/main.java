import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class main {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("DrogonBall");
	Random Random = new Random();
	int top_sayisi = Random.nextInt(7);
	Queue<String> Alanlar = new LinkedList<String>();
	Alanlar.offer("Ace");
	Alanlar.offer("Shanks");
	Alanlar.offer("Edward");
	Alanlar.offer("Sphirot");
	Alanlar.offer("Goku");
	Alanlar.offer("Asdgg");
	Alanlar.offer("Sdgdsg");
	Alanlar.offer("Sdfg");
	Alanlar.offer("Sfdg");
	Alanlar.offer("Sfdls");
	System.out.println("Yarisma Basliyor...");
	Thread.sleep(1000);
	System.out.println("Top sayisi: " + top_sayisi);
	Thread.sleep(1000);
	while(!Alanlar.isEmpty() && top_sayisi > 0) {
		System.out.println(Alanlar.poll() + " DragonBall aldi");
		Thread.sleep(1000);
		System.out.println("Top sayisi: " + top_sayisi);
		top_sayisi --;
		Thread.sleep(1000);
	}
	Thread.sleep(1000);
	System.out.println("Yarisma sona erdi..");
	}
}
