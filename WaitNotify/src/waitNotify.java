import javax.net.ssl.SNIHostName;

public class waitNotify {
public void Wait()
{
	synchronized(this)
	{
		System.out.println("Thread1 calisiyor..");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1 thread2 nin uyandirmasini bekliyor..");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 calismaya devam ediyor..");
	}
	
}
public void Notify()
{
	synchronized (this) {
		System.out.println("Thread2 calisiyor..");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 uyandiriliyor..");
		notify();
		System.out.println("Thread 1 2 sn sonra uyandirilacak...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
