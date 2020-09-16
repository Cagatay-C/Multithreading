package chapter8;

import java.util.List;

public class StringOperationThread extends Thread{

	private List<Character> characters;
	private String message;
	
	public StringOperationThread(List<Character> characters, String message) {
		this.characters = characters;
		this.message = message;
	}
	
	@Override
	public void run() {
		synchronized(characters) {
		System.out.println("Characters quired by " + Thread.currentThread().getName());
		for(int i=0; i<message.length(); i++) {
			characters.add(message.charAt(i));
		}
		System.out.println(characters);

		}
	}
}
