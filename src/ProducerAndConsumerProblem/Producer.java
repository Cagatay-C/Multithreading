package ProducerAndConsumerProblem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread{

	private static final int MAX_SIZE = 3;
	private final List<String> messages = new ArrayList<String>();
	
	@Override
	public void run() {
		try {
			while(true) {
				produce();				
			}
		} catch (Exception e) {
		}
	}
	
	public synchronized void produce() throws Exception{
		while(messages.size() == MAX_SIZE) {
			System.out.println("Queue reached it's limit. Waiting for Consumer");
			wait();		
			System.out.println("Producer got notification from consumer");
		}
		String data = LocalDateTime.now().toString();
		messages.add(data);
		System.out.println("Producer produced data");
		notify();
	}
	
	public synchronized String consume() throws Exception{
		notify();
		while(messages.isEmpty()) {
			wait();
		}
		String data = messages.get(0);
		messages.remove(data);
		return data;
	}
}
