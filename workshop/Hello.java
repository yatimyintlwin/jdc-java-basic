public class Hello {

	public static void main(String[] args) {
		System.out.println("-------------------");
		greet("MON");
		greet("TUE");
		greet("WED");
		greet("THU");
		greet("FRI");
		greet("SAT");
		greet("SUN");
		System.out.println("-------------------");
	}

	// f(x, y) = x + y
	static void greet(String day) {
		System.out.println("Hello From " + day);
	}
}

// Camel Case
class VeryBigDog {

}

class Cat {

}