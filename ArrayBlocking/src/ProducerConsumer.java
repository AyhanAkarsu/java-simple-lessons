import java.security.PublicKey;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class ProducerConsumer {
ArrayBlockingQueue<Integer> quee = new ArrayBlockingQueue<Integer>(10);
Random random = new Random();
public void Producer()
{
	while(true)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  try {
		Integer value = random.nextInt(100);
		quee.put(value);
		System.out.println("Producer deger uretiyor: " + value);
		System.out.println("Size: " + quee.size());
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public void Consumer()
{
	while(true)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Integer value = quee.take();
			System.out.println("Consumer tuketiyor...");
			System.out.println(quee.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}