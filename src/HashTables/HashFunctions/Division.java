package HashTables.HashFunctions;

public class Division implements HashFunction{

	public int hashCode(int num, int size) {
		// TODO Auto-generated method stub
		return num%size;
	}

}
