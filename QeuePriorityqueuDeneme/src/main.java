import java.util.PriorityQueue;
import java.util.Queue;

public class main {

	public static void main(String[] args) throws InterruptedException {
    Queue<Oncelik> oncelik = new PriorityQueue<Oncelik>();
    oncelik.offer(new Oncelik("Mehmet", "Agir yaralanma"));
    oncelik.offer(new Oncelik("Veysel", "Yaralanma"));
    oncelik.offer(new Oncelik("Ayse", "Bas Agrisi"));
    oncelik.offer(new Oncelik("Elif", "Agir yaralanma"));
    oncelik.offer(new Oncelik("Mahmut", "Yaralanma"));
    System.out.println("***************************");
    System.out.println("Oncelik sirasi olusturuluyor..");
    System.out.println("********************************");
    Thread.sleep(1000);
while(!oncelik.isEmpty()) {
	System.out.println(oncelik.poll());
	System.out.println("********************");
	Thread.sleep(1000);
}
	}

}
