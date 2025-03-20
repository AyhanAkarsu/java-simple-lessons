import java.util.concurrent.Semaphore;

public class SemaPhore {
	private Semaphore semaphore = new Semaphore(2);

public void Semophonedeneme(String ID)
{
	try {
		semaphore.acquire();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("Thread " + ID + " calisiyor...");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Thread " + ID + " isini bitirdi..");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	semaphore.release();
}
}
