package chapter5;

public class ThreadPriority {

	public static void main(String[] args) {
		CalculatorRunnable runnable = new CalculatorRunnable(300000000L);
		Thread threadOne = new Thread(runnable);
		threadOne.setPriority(Thread.MAX_PRIORITY);
		threadOne.setName("Max Priority");
		threadOne.start();

		Thread threadTwo = new Thread(runnable);
		threadTwo.setPriority(Thread.NORM_PRIORITY);
		threadTwo.setName("Norm Priority");
		threadTwo.start();
	
		Thread threadThree = new Thread(runnable);
		threadThree.setPriority(Thread.MIN_PRIORITY);
		threadThree.setName("Min Priority");
		threadThree.start();
		
		try {threadOne.join();}catch(Exception e) {}

		try {threadTwo.join();}catch(Exception e) {}

		try {threadThree.join();}catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName());
	}

}
