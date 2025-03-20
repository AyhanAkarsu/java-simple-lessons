
public class threadler implements Runnable{
private int sira;
private String ad;
public threadler(int sira, String ad) {
	this.sira = sira;
	this.ad = ad;
}
@Override
public void run() {
	try {
		System.out.println("ad: " + ad + " sira: " + sira + " ise basladi.");
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("ad: " + ad + " sira: " + sira + " isi bitirdi.");
}
public static void calistir()
{
	Thread t1 = new Thread(new threadler(1, "thread1"));
	Thread t2 = new Thread(new threadler(2, "thread2"));
	Thread t3 = new Thread(new threadler(3, "thread3"));
	Thread t4 = new Thread(new threadler(4, "thread4"));
	Thread t5 = new Thread(new threadler(5, "thread5"));
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	t3.start();
	t4.start();
	try {
		t3.join();
		t4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t5.start();
	try {
		t5.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Tum isler bitti..");
}
}

