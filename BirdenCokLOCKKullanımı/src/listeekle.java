import java.util.ArrayList;
import java.util.List;

public class listeekle {
ArrayList<Integer> ekle1 = new ArrayList<Integer>();
ArrayList<Integer> ekle2 = new ArrayList<Integer>();

public void listeEkle1()
{
	for(int i = 0; i < 2000; i++)
	{
		try {
			ekle1.add(i);
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public void listeEkle2()
{
	for(int i = 0; i < 2000; i++)
	{
		try {
			ekle2.add(i);
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public void degerEkle()
{
	listeEkle1();
	listeEkle2();
	System.out.println("Liste1: " + ekle1.size() + " Liste2: " + ekle2.size());
}
}