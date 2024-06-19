public class LocalClass {

	public static void main(String[] args) {
		demo(10);
	}

	public static void demo(int count) {

		class Local {
			int sumOfEven;
			int sumOfOdd;
		}

		var local = new Local();

		for(var i = 1; i <= count; i ++) {
			if(i % 2 == 0) {
				local.sumOfEven += i;
			} else {
				local.sumOfOdd += i;
			}
		}

		System.out.println("Sum of Event is " + local.sumOfEven);
		System.out.println("Sum of Odd is " + local.sumOfOdd);
	}
}