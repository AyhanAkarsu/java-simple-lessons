import java.lang.System.Logger;

public class main {
private int sayac;
public synchronized void arttir()
{
	sayac++;
}
public void sayacarttir() {
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		  for(int i = 0; i < 5000; i++)
		  {
			  arttir();
		  }
		}
	});
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i = 0; i < 5000; i++)
			{
				arttir();
			}
			
		}
	});
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

	public static void main(String[] args) {
	main m = new main();
	m.sayacarttir();
	System.out.println(m.sayac);
	}

}
