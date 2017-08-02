package HashTables.HashFunctions;

import java.util.Random;

public class UniversalHashFunction implements HashFunction {
	private int a;
	private int b;
	private int prime;
	private Random rand;
	public UniversalHashFunction() {
		rand = new Random();
		prime = 97;
		a = rand.nextInt(96)+1;
		b=rand.nextInt(96);
		
	}
	public int hashCode(int num, int size) {
		return ((num*a+b)%prime)%size;
	}
}
