package ThreadPooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ThreadPoolTest example = new ThreadPoolTest();
		example.startThreadPoolExample();

	}

	private void startThreadPoolExample() {
		ExecutorService executorService = Executors.newSingleThreadExecutor(); // Every thread gets the CPU one by one
													// newFixedThreadPool(?) Parallel with specific number of thread 					
		WorkTask task1 = new WorkTask("Task-1");	// newCachedThreadPool() Parallel with possible maximum number of thread
		WorkTask task2 = new WorkTask("Task-2");
		WorkTask task3 = new WorkTask("Task-3");
		WorkTask task4 = new WorkTask("Task-4");
		WorkTask task5 = new WorkTask("Task-5");
		WorkTask task6 = new WorkTask("Task-6");
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.submit(task4);
		executorService.submit(task5);
		executorService.submit(task6);
		
		executorService.shutdown();
		
	}

}
