public class NestedDemo {

	public static void main(String[] args) {
		
		var n1 = new NestedClasses.StaticNestedClasses();

		var owner = new NestedClasses();
		var n2 = owner.new InnerClass();
	}
}