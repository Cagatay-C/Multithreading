package chapter7;

public class CustomThread extends Thread {

	private boolean shouldExit = false;
	
	public void setShouldExit(boolean shouldExit) {
		this.shouldExit = shouldExit;
	}
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<13; i++) {
			if(shouldExit) {
				break;
			}
			try {
				System.out.println("I'm alive");
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long timeTaken = System.currentTimeMillis() - startTime;
		System.out.println("Thread is completed within: " + timeTaken);
	}
}
