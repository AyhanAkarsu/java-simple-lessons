import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentanlock {
private int sayi;
private Lock lock = new ReentrantLock();

	public void arttir()
	{
		for(int i = 1; i <= 10000; i++)
		{
			sayi++;
		}
	}
	public void art1()
	{
		lock.lock();
		try {
			arttir();
		}
		finally {
			lock.unlock();
		}
	}
	public void at2()
	{
		lock.lock();
		try {
			arttir();
		}
		finally {
			lock.unlock();
		}
	}
	public void sonuc()
	{
		System.out.println("Sayi: " + sayi);
	}
	
	
	
	
	
	
	
	
}
