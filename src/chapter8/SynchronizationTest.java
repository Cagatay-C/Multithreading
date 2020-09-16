package chapter8;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationTest {

	public static void main(String[] args) throws InterruptedException{
		List<Character> list = new ArrayList<>();
		
		StringOperationThread firstThread = new StringOperationThread(list,"Cagatay");
		firstThread.start();

		StringOperationThread secondThread = new StringOperationThread(list, "Cinkir");
		secondThread.start();
		
		firstThread.join();
		secondThread.join();
	}

}
