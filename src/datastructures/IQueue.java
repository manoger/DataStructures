package datastructures;

public interface IQueue<T> {
	
	void enqueue(T a);
	<T> T dequeue();
	boolean isFull();
	boolean isEmpty();
	<T> T peek();
	
}
