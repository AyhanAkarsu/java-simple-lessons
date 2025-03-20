import java.lang.reflect.Executable;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executor extends threadler{

	public executor(int sira, String ad) {
		super(sira, ad);
	}
	@Override
	public void run() {
		super.run();
	}
	public static void calistir2() {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i = 1; i <= 5; i++)
		{
			executorService.submit(new threadler(i,"Thrread"+String.valueOf(i)));
		}
		executorService.shutdown();
		try {
			executorService.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Tum isler bitti....");
	}

}
