package ProducerAndConsumerProblem;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Producer producer = new Producer();
		producer.setName("Producer-1");
		producer.start();
		
		Consumer consumer = new Consumer(producer);
		consumer.setName("Consumer-1");
		consumer.start();
		
		Consumer consumerSecond = new Consumer(producer);
		consumerSecond.setName("Consumer-2");
		consumerSecond.start();
		
		Consumer consumerThird = new Consumer(producer);
		consumerThird.setName("Consumer-3");
		consumerThird.start();
	}
}
