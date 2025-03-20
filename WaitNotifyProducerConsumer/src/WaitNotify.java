import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class WaitNotify {
Queue<Integer> quee = new LinkedList<Integer>();
Random random = new Random();
Object lock = new Object();

public void Producer()
{
		while(true)
		{
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lock)
			{
				if(quee.size() >= 10)
				{
				  try {
					  System.out.println("Producer bekliyor...");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				}
				System.out.println("Producer calisiyor...");	
				Integer value = random.nextInt(100);
				System.out.println("Producer uretiyor: " + value);
				quee.offer(value);
				System.out.println("Size: " + quee.size());
				lock.notify();
		}
	}
}
public void Consumer()
{
		while(true)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lock)
			{
				System.out.println("Consumer calisyor..");
				if(quee.size() == 0)
					try {
						System.out.println("Consumer bekiliyor...");
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Integer value = quee.poll();
				System.out.println("Consumer tuketiyor: " + value);
				System.out.println("Size: " + quee.size());
				lock.notify();
			}
	}
}
}
