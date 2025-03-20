import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.ls.LSOutput;

public class main {

	public static void main(String[] args) {
		
/* Queue(kuyruk) ----> interface ' ini implemente eden lind-kedlist class FIFO
 * add(eleman) -----------> Elemanı kuyruğa ekler ekleyemezse hata verir
 * offer(eleman) ---> elemanı kuyruğa ekler ekleyemezse false döner.
 * remove() -----> kuruğun en başındaki elemanı kuyrukdan çıkarır kuyruk boşsa hata verir
 * poll() -----> kuruğun en başındaki elemanı kuyrukdan çıkarır kuyruk boşsa null döner.
 * element() ----> kuyruğun en başındaki elemanı döner kuyruk boşsa hata verir.
 * peek() --------> kuyruğun en başındaki elemanı döner kuyruk boşsa null referansını döner.
 * 
*/
		
		
		Queue<Character> queue = new LinkedList<Character>();
	queue.offer('A');
	queue.offer('Y');
	queue.offer('H');
	queue.offer('A');
	queue.offer('N');
	for (Character character : queue) {
		System.out.println(character);
	}
	while(!queue.isEmpty()) {
		System.out.println("Karakter cikariliyor: " + queue.poll());
	}
	System.out.println(queue.peek());
	if(!queue.isEmpty()) {
		System.out.println(queue.element());
	}
	}
}
