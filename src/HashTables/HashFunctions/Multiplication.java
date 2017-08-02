  package HashTables.HashFunctions;

public class Multiplication implements HashFunction {
	// (A*K mod 2^w) rsh(w-r)
	public int hashCode(int num, int size) {
		int r = Integer.bitCount((Integer.highestOneBit(size-1)<<1)-1);
		int w = 30;
		int A = (int)(0.6180339887*(1<<w));
		int k = num;
		return ((k*A)&((1<<w)-1))>>(w-r);
	}
}
