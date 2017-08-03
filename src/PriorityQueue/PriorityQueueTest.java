package PriorityQueue;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class PriorityQueueTest {

	@Test
	public void test() {
		Random rand = new Random();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int size = 100;
		for(int i=0;i<size;i++) {
			pq.insert(rand.nextInt(100));
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
