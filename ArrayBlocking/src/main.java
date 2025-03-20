
public class main {

	public static void main(String[] args) {
		ProducerConsumer producerConsumer = new ProducerConsumer();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				producerConsumer.Consumer();
				
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				producerConsumer.Producer();
				
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
