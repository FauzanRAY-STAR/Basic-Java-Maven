package src.main.java;

public class Counters {

	private int count;
	
	public Counters() {
		this.reset();
	}
		
	public void resets() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
