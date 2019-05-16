package datastructures;
import java.lang.reflect.Array;

public class Stack<T> {
	int idx=-1;
	T[] pilha;
	
	Stack(Class<T> c,int idx){
		final T[] a = (T[]) Array.newInstance(c, idx);
		this.pilha=a;
	}
	
	Stack mpo(){
		return null;
	}
	
	void mpu(){
		
	}
	
	void pu(){
		
	}
	
	<T> T po(){
		return null;
	}
	
}
