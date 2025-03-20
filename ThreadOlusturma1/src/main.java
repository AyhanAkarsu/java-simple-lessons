import java.security.PublicKey;
import java.util.Iterator;

import Thread2.thread2;

public class main {

	public static void main(String[] args) {
		thread t1 = new thread("Sayac1");
		thread t2 = new thread("Sayac2");
		Thread t3 = new Thread(new thread2("Sayac3"));
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Sayac4 calisiyor...");
				for(int i=-20; i <= 0; i += 2)
				{
					System.out.println("Sayac4: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Main calisyor...");
		for(int i=0; i <= 10; i++)
		{
			System.out.println("Main: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
