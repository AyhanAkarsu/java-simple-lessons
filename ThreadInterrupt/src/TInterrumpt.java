import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TInterrumpt {
	public static void main(String[] args) {
	Thread thread = new Thread(new Runnable() {
		
		@Override
		public void run() {
		System.out.println("Thread 1 calismaya basladi");
		for(int i = 1; i < 10; i++)
		{
			try {
				Thread.sleep(500);
				System.out.println("Thread 1 yaziyor: " + i);
			} catch (InterruptedException e) {
			System.out.println("Thread 1 kesmeye ugradi...");
			}
		}
		System.out.println("Thread 1 isini bitirdi...");
		}
	});
	thread.start();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	thread.interrupt();
	
	System.out.println("************************");
	Thread thread2 =  new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread 2 calismaya basladi...");
			List<Integer> list = new LinkedList<>();
			for(int i = 1; i < 1000000000 ; i++)
			{
				if(Thread.currentThread().isInterrupted())
				{
					System.out.println("Thread 2 nin calismasi durduruldu...");
					return;
				}
				list.add(i);
			}
			System.out.println("Bitti...");
		}
	});
	thread2.start();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	thread2.interrupt();
	}
}
