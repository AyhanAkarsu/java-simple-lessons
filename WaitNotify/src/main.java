
public class main {

	public static void main(String[] args) {
		waitNotify wn = new waitNotify();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				wn.Wait();
				
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				wn.Notify();
				
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

	}

}
