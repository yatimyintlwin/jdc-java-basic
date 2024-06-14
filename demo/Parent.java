package demo;

public class Parent {

	private final String name;
	private static final int count;

	static {
		count = 10;
	}

	public Parent() {
		name = "Test";
	}

	public void doSomething() {}

	public static final void test() {}
}

class Child extends Parent {

	@Override
	public void doSomething() {}
}