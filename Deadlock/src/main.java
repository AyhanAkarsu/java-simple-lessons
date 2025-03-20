
public class main {

	public static void main(String[] args) {
		deadlock deadlock1 = new deadlock();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				deadlock1.t1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				deadlock1.t2();
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
		deadlock1.goster();
	}
}
