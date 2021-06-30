package scope;

public class Counter {

	public static int count = 0;

	public static int addOne() {
		count++;
		return count;
	}

	public static int minusOne() {
		count--;
		return count;
	}

}
