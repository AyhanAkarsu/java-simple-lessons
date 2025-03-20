
public class main {

	public static void main(String[] args) {
		reentanlock reentanlock = new reentanlock();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				reentanlock.art1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				reentanlock.at2();
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
		reentanlock.sonuc();
		System.out.println("******************************");
		AwaitSignal awaitSignal = new AwaitSignal();
		Thread thread3  = new Thread(new Runnable() {
			
			@Override
			public void run() {
				awaitSignal.art1();
				
			}
		});
		Thread thread4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				awaitSignal.art2();
				
			}
		});
		
thread3.start();
thread4.start();
try {
	thread3.join();
	thread4.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
awaitSignal.goster();
	}
}
