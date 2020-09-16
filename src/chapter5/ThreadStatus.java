package chapter5;

public class ThreadStatus {

	public static void main(String[] args) throws InterruptedException{
		CalculatorRunnable runnable = new CalculatorRunnable(300000000L);
		Thread thread = new Thread(runnable);
		thread.setName("High Priority");
		thread.start();
		
		long startTime = System.currentTimeMillis();
		thread.join(100);
		long timeTaken = System.currentTimeMillis() - startTime;
		System.out.println("Joining compleated within: " + timeTaken 
				+ thread.getName());
		
		System.exit(0);
	}

}
