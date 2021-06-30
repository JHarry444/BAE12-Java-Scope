package scope;

public class App {

	public static void main(String[] args) {
		int i = 2; // local variable
		System.out.println(i);
//		System.out.println(i);

		System.out.println(Counter.addOne());

		System.out.println(Counter.addOne());

		System.out.println(Counter.addOne());

		System.out.println(Counter.addOne());

		System.out.println(Counter.addOne());

		System.out.println(Counter.addOne());

		System.out.println(Counter.addOne());
		System.out.println(Counter.minusOne());

		System.out.println(Counter.count);
	}

}
