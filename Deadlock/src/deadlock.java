import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class deadlock {
	Random random = new Random();
	Hesap hesap1 = new Hesap();
	Hesap hesap2 = new Hesap();
private Lock lock1 = new ReentrantLock();
private Lock lock2 = new ReentrantLock();
public void deadlockkontrol(Lock a, Lock b)
{
	boolean a_tut = false;
	boolean b_tut = false;
	while(true)
	{
		a_tut = a.tryLock();
		b_tut = b.tryLock();
		if(a_tut && b_tut)
		{
			return;
		}
		if(a_tut)
		{
			a.unlock();
		}
		if(b_tut)
		{
			b.unlock();
		}
	}
}
public void t1()
{
	deadlockkontrol(lock1, lock2);
	for(int i = 0; i < 5000; i++)
	{
		
		hesap1.hesaptangonder(hesap1, hesap2, random.nextInt(100));
	}
	lock1.unlock();
	lock2.unlock();
}
public void t2()
{
	deadlockkontrol(lock1, lock2);
	for(int i = 0; i < 5000; i++)
	{
	    hesap2.hesaptangonder(hesap2, hesap1, random.nextInt(100));	
	}
	lock1.unlock();
	lock2.unlock();
}
public void goster()
{
	System.out.println("Hesap1 bakiye: " + hesap1.getbakiye() + "\nHesap2 bakiye: " + hesap2.getbakiye());
	System.out.println("Toplam bakiye: " + (hesap1.getbakiye() + hesap2.getbakiye()));
}
}
