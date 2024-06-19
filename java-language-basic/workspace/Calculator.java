public class Calculator {

	public static void main(String[] args) {
		
		String arg1 = args[0];
		String arg2 = args[1];

		int a = Integer.parseInt(arg1);
		int b = Integer.parseInt(arg2);

		int result = add(a, b);
		System.out.println("Result is " + result);
	}

	static int add(int a, int b) {
		return a + b;
	}

}