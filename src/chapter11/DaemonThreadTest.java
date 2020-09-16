package chapter11;

public class DaemonThreadTest {

	public static void main(String[] args) {

		Thread th = new Thread(() ->{
			while(true) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		th.setDaemon(true); // If the thread is a daemon thread program will shutdown,
							// otherwise it will continue to run
		th.start();
		System.out.println("Expecting program shutdown");
	}
}
