package Thread2;

public class thread2 implements Runnable{
private String isim;
	public thread2(String isim) {
	this.isim = isim;
}
	@Override
	public void run() {
		System.out.println("Sayac3 calisiyor...");
		for(int i=0; i <= 20; i += 2 )
		{
			System.out.println(isim + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}


