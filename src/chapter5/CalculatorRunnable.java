package chapter5;

public class CalculatorRunnable implements Runnable{

	long value;
	
	public CalculatorRunnable(long value) {
		this.value = value;
	}
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		long sum = 0;
		for(int i=0; i<value; i++) {
			sum += i;
		}
		long elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed Time: " + elapsedTime + " for Thread: " + 
				Thread.currentThread().getName());
	}

}
