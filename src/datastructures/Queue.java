package datastructures;

public class Queue<T> implements IQueue {
	private int elementsQuantity=0;
	private Object[] vector;
	
	public Queue(int size){
		vector=new Object[size];
	}
	public boolean isFull(){
		return elementsQuantity==vector.length;
	}
	public boolean isEmpty(){
		return elementsQuantity==0;
	}
	public void enqueue(Object info) {
		if(isFull()) {
			throw new IndexOutOfBoundsException();
		}else {
			vector[elementsQuantity++]=info;
		}
	}
	public Object peek() {
		return (T) vector[0];
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}else {
			T first = (T) vector[0];
			for(int i=1;i<(elementsQuantity-1);i++) {
				vector[i-1]=vector[i];
			}
			return first;
		}
	}
	
}
