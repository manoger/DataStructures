package datastructures;

public interface IStack<T> {
	void push(T element);
	void multiPush(T element);
	<T> T multiPull(int elementsQuantity);
	boolean isEmpty();
	boolean isFull();
}
