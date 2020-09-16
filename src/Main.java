
public class Main {

	public static void main(String[] args) {
		Thread helloThread = createHelloThread();
		Thread nameThread = createNameThread();
		Thread addressThread = createAddressThread();
		
		
		try{helloThread.join();}catch(Exception e) {};
		try{nameThread.join();}catch(Exception e) {};
		try{addressThread.join();}catch(Exception e) {};
		
		
		System.out.println("I'm Main Thread " + Thread.currentThread().getName());

	}
	
	private static Thread createHelloThread(){
		Thread th = new HelloThread();
		th.start();
		return th;
	}
	
	private static Thread createNameThread() {
		Thread th = new Thread(new NameThread());
		th.setName("Name Thread");
		th.start();
		return th;
	}
	
	private static Thread createAddressThread() {
		Thread th = new Thread(new AddressThread());
		th.setName("Address Thread");
		th.start();
		return th;
	}

}
