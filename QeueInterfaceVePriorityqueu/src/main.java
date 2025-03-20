import java.util.PriorityQueue;
import java.util.Queue;

class player implements Comparable<player>{
	private String isim;
	private int ID;
	public String getIsim() {
		return isim;
	}
	public int getID() {
		return ID;
	}
	public player(String isim, int ID) {
		super();
		this.isim = isim;
		this.ID = ID;
	}
	@Override
	public String toString() {
		return "player [isim=" + isim + ", ID=" + ID + "]";
	}
	@Override
	public int compareTo(player o) {
		if(this.ID < o.ID) {
			return 1;
		}
		else if(this.ID > o.ID) {
			return -1;
		}
		return 0;
	}
}

public class main {

	public static void main(String[] args) {
		/*Queue Interface ve PriorityQueue Sinifi

PriorityQueue normal Queue mantiği gibi davranmaz. Elemanlar öncelik siralarina gore
 yüksek öncelik kazanır. Integerlarda en yüksek öncelik en küçük sayıda, en düşük
 öncelik en büyük saprdadır. Stringlerde en yüksek öncelik alfabetik olarak sözlükte 
 en önce gelen waringte en düşük öncelik alfabetik olarak sözlükte en son gelen
  stringtedir.

add veya offer () metodlari --->Kuyruda eleman ekler. 
clear() ----> Kuyruğu Temizler.
contains (Object o) -> o objesi kuyruğun içindeyse true, değilee false doner. 
peek()-> Kuyruğun başındaki elemanı döner. Eğer kuyruk boşsa null referensı doner.
poll ()-> Kuyruğun başındaki elemanı çıkartar ve değer olarak döner. 
Eğer kuyruk bossa null referans dener. 
size()---> Kuyruğun içindeki eleman sayisini döner.
		 */
Queue<Character> queue = new PriorityQueue<Character>();
queue.offer('A');
queue.offer('Y');
queue.offer('H');
queue.offer('A');
queue.offer('N');
Queue<Integer> queue2 = new PriorityQueue<Integer>();
queue2.offer(5);
queue2.offer(4);
queue2.offer(3);
queue2.offer(2);
queue2.offer(1);
	for (Character character : queue) {
		System.out.println(character);
	}
		System.out.println("************************");
		for (Integer integer : queue2) {
			System.out.println(integer);
		}
		System.out.println("******************");
		while(!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}
		System.out.println("*****************************");
		Queue<player> queue3 = new PriorityQueue<player>();
		queue3.offer(new player("Ayhan", 0));
		queue3.offer(new player("Ace", 5));
		queue3.offer(new player("Shanks", 2));
		queue3.offer(new player("Sdfbdfb", 9));
		
		while(!queue3.isEmpty()) {
			System.out.println(queue3.poll());
		}
	}

}
