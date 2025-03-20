import java.util.ArrayList;
import java.util.Random;

public class Calistir {
Random random = new Random();
ArrayList<Integer> ekle1 = new ArrayList<Integer>();
ArrayList<Integer> ekle2 = new ArrayList<Integer>();
public void degerekle1()
{
 try {
	Thread.sleep(1);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 ekle1.add(random.nextInt(100));
}
public void degereklee2()
{
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ekle2.add(random.nextInt(100));
}
public void degerleriekle()
{
	for(int i = 0; i < 1000; i++)
	{
		degerekle1();
		degereklee2();
	}
}
public void calistir()
{
	long baslangic = System.currentTimeMillis();
	Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			degerleriekle();
		}
	});
	Thread thread2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			degerleriekle();
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
	System.out.println("Liste1: " + ekle1.size() + " Liste2: " + ekle2.size());
	System.out.println("Bitis suresi: " + (bitis - baslangic));
}
}
