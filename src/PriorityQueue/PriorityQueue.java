package PriorityQueue;

import java.util.*;

public class PriorityQueue<T extends Comparable<T>> {
	List<T> arr;
	// 1,2,3,4,5
	// parent -> left node i*2+1
	// parent ->right node i*2+2
	// child node -> parent (i-1)/2
	public PriorityQueue() {
		arr = new ArrayList<T>();
	}
	
	
	public void insert(T item) {
		arr.add(item);
		swim(arr.size()-1);
		
	}
	
	public T poll() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
			}
		exch(0,arr.size()-1);
		T ret = arr.remove(arr.size()-1);
		sink(0);
		
		return ret;
	}
	
	public boolean isEmpty() {
		return arr.size() ==0;
	}
	
	public void swim(int i) {
		while(i>0) {
			int j = (i-1)/2;
			if(less( arr.get(i), arr.get(j))){
				exch(i,j);
				i=j;
			}
			else {
				break;
			}
		}
	}
	
	public void sink(int i) {
		while(i*2+1<arr.size()) {
			int j = i*2+1;
			if(j+1<arr.size() && less(arr.get(j+1), arr.get(j))) {
				j++;
			}
			if(less(arr.get(j),arr.get(i))) {
				exch(i,j);
				i=j;
			}
			else {
				break;
			}
			
			
		}
	}
	
	private boolean less(T a, T b) {
		return a.compareTo(b)<0;
	}
	
	private void exch(int i, int j) {
		T temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}
	
}
