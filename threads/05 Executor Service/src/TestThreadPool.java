import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String[] args) {
		
		
		
		
		ExecutorService executor = Executors.newFixedThreadPool(3);// creating a pool of 3 threads
		for (int i = 1; i <= 10; i++) {
			WorkerThread worker = new WorkerThread("" + i);
			executor.execute(worker);// calling execute method of ExecutorService
		}
		executor.shutdown();
		/*while (!executor.isTerminated()) {
		}*/

		System.out.println("Finished all threads");
	}
}