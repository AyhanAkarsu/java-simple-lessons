import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

	public static void main(String[] args) {
		/*ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				Random random = new Random();
				int sure = random.nextInt(2000) + 1000;
				System.out.println("Thread calisiyor..");
				try {
					Thread.sleep(sure);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread isini bitirdi...");
			}
		});
		executorService.shutdown();*/
		ExecutorService executorService = Executors.newFixedThreadPool(1);
	 Future<Integer> future	= executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int sure = random.nextInt(2000) + 1000;
				if(sure > 2500)
				{
					throw new IOException("Sure cok uzun...");
				}
				Thread.sleep(sure);
				System.out.println("Thread calisiyor...");
				Thread.sleep(sure);
				System.out.println("Thread isini bitirdi...");
				return sure;
			}
		});
		executorService.shutdown();
		try {
			System.out.println("Gecen sure: " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e);
		}
	}
}
