package ThreadPooling;

public class WorkTask implements Runnable{

	private long createdTime;
	private String taskName;
	
	WorkTask(String name){
		createdTime = System.currentTimeMillis();
		taskName = name;
	}
	
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		long waitedTime = System.currentTimeMillis() - createdTime;
		System.out.println(taskName + " got CPU after waiting " + waitedTime +
				" ms with thread " + currentThread.getName());
		try {
			Thread.sleep(3000);
			System.out.println(taskName + " completed. Releasing thread " + currentThread.getName());
		} catch (Exception e) {
		}
	}
	

}
