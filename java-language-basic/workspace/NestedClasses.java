public class NestedClasses {

	public static void main(String[] args) {
		var nested = new StaticNestedClasses();
		var owner = new NestedClasses();
		var inner = owner.new InnerClass();
	}

	private InnerClass innerObject;

	public NestedClasses() {
		innerObject = new InnerClass();
	}

	public void doSomething() {
		var inner = new InnerClass();
	}

	public class InnerClass {

	}

	public static class StaticNestedClasses{

	}
}