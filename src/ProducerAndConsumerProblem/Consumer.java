package ProducerAndConsumerProblem;

public class Consumer extends Thread{

	Producer producer = new Producer();
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String data = producer.consume();
				System.out.println("Consumed by: " + Thread.currentThread().getName()
						+ " Data: " + data);
				Thread.sleep(500);
			}
		} catch (Exception e) {
		}
	}
}
