package HashTables.HashFunctions;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class HashFunctionTest {

	@Test
	public void MultiplicationTest() {
		HashFunction hf_mp = new Multiplication();
		Random rand = new Random();
		int size =16;
		int[] counts = new int[16];
		for(int i=0;i<100000; i++) {
			int num = rand.nextInt(1580);
			int hashCode = hf_mp.hashCode(num,size);
			counts[hashCode]++;
		}
		System.out.println("Multiply hashfunction");
		for(int i=0; i<size;i++) {
			System.out.println(counts[i]);
		}
		assertEquals(hf_mp.hashCode(13,size),hf_mp.hashCode(13,size));
		
	}
	
	@Test
	public void DivisionTest() {
		HashFunction hf = new Division();
		Random rand = new Random();
		int size =16;
		int[] counts = new int[16];
		for(int i=0;i<100000; i++) {
			int num = rand.nextInt(1580);
			int hashCode = hf.hashCode(num,size);
			counts[hashCode]++;
		}
		System.out.println("Division hashfunction");
		for(int i=0; i<size;i++) {
			System.out.println(counts[i]);
		}
		assertEquals(hf.hashCode(13,size),hf.hashCode(13,size));
		
	}
	
	@Test
	public void UniversalHashFunctionTest() {
		HashFunction hf = new UniversalHashFunction();
		int size =16;
		Random rand = new Random();
		int[] counts = new int[16];
		for(int i=0;i<100000; i++) {
			int num = rand.nextInt(1580);
			int hashCode = hf.hashCode(num,size);
			counts[hashCode]++;
		}
		System.out.println("Universal HashFunction ");
		for(int i=0; i<size;i++) {
			System.out.println(counts[i]);
		}
		assertEquals(hf.hashCode(13,size),hf.hashCode(13,size));
		
	}

}
