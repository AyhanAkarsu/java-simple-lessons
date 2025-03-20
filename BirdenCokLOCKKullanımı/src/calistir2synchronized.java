import java.util.ArrayList;
import java.util.Random;

import org.w3c.dom.ls.LSOutput;

public class calistir2synchronized {
ArrayList<Integer> ekle1 = new ArrayList<Integer>();
ArrayList<Integer> ekle2 = new ArrayList<Integer>();
Random random = new Random();
Object lock1 = new Object();
Object lock2 = new Object();
public synchronized void degerekle1()
{
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	ekle1.add(random.nextInt(100));
}
public synchronized void degerekle2()
{
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ekle2.add(random.nextInt(100));
}
public void degerekle()
{
	for(int i = 0; i< 1000; i++)
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
	System.out.println("Liste1 size: " + ekle1.size() + " Liste2 size: " + ekle2.size());
	System.out.println("Bitis suresi: " + (bitis - baslangic));
}
}
