package chapter7;

public class ThreadPauseTest {

	public static void main(String[] args) throws InterruptedException{
		CustomThread thread = new CustomThread();
		thread.start();

//		Thread.sleep(3000);
//		if(thread.isAlive()) {
//			System.out.println(thread.getState());
//			thread.setShouldExit(true);
//			thread.join();
//		}
		
		int maxSleep = 3000;
		int slept = 0;
		while(slept < maxSleep) {
			Thread.sleep(300);
			slept+=300;
			if(!thread.isAlive()) {
				System.out.println("Thread was completed within 3 seconds");
				System.exit(0);
			}
		}
		if(thread.isAlive()) {
			thread.setShouldExit(true);
			thread.join();
		}
			
			
			
		System.exit(0);
	}
}
