import java.awt.print.Printable;

public class thread extends Thread{
	private String isim;

	@Override
	public void run() {
		System.out.println(toString());
		for(int i=-10; i <= 0; i++)
		{
			System.out.println(isim + ": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return isim + " calisiyor....";
	}

	public thread(String isim) {
		this.isim = isim;
	}

}
