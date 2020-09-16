
public class AddressThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Starting Thread Name: " + Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.println("Address");
			try {Thread.sleep(200);} catch(Exception e) {}
		}
		System.out.println("Ending Thread Name: " + Thread.currentThread().getName());
	}

}
