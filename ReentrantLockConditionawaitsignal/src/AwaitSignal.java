import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignal {
private int sayi;
private Lock lock = new ReentrantLock();
private Condition condition = lock.newCondition();
public void arttir()
{
	for(int i = 0; i<10000; i++)
	{
		sayi ++;
	}
}
public void art1()
{
	lock.lock();
	System.out.println("Thread 1 calisiyor...");
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("Thread 1 thread 2 nin uyandirmasini bekliyor..");
	try {
		condition.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Thread 1 uyandi isini yapiyor...");
	arttir();
	lock.unlock();
}
public void art2()
{
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	lock.lock();
	System.out.println("Thread 2 calisiyor...");
	arttir();
	System.out.println("Thread 2 isini bitirdi..");
	System.out.println("Thread 2 thread 1 i uyandiriyor...");
	System.out.println("Thread 1 2 sn sonra uyanacaktir..");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	condition.signal();
	lock.unlock();
}
public void goster()
{
	System.out.println("Sayi: " + sayi);
}
}
