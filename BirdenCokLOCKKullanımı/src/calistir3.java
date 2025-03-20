import java.util.ArrayList;
import java.util.Random;

public class calistir3 {
	ArrayList<Integer> liste1 = new ArrayList<>();
	ArrayList<Integer> liste2 = new ArrayList<>();
	Random random = new Random();
	private Object lock1 = new Object();
	private Object lock2 = new Object();
public void degerekle1()
{
	synchronized(lock1)
	{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		liste1.add(random.nextInt());
	}
}
public void degerekle2()
{
	synchronized(lock2)
	{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		liste2.add(random.nextInt());	
	}
}
public void degerekle()
{
	for(int i = 0; i < 1000; i++)
	{
		degerekle1();
		degerekle2();
	}
}
public void calistir()
{
	long baslangic = System.currentTimeMillis();
	Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			degerekle();
		}
	});
	Thread thread2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			degerekle();
		}
	});
	thread1.start();
	thread2.start();
	try {
		thread1.join();
		thread2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	long bitis = System.currentTimeMillis();
	System.out.println("Liste1 size: " + liste1.size() + " Liste2: " + liste2.size());
	System.out.println("Bitis zamani: " + (bitis - baslangic));
}
}
