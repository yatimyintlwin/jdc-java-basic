public class Overriding {

	public static void main(String[] args) {
		var student = new Student("Aung Aung");
		student.greet();
	}
}

class Person {

	String name;

	Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello! I am " + name);
	}
}

class Student extends Person {

	Student(String name) {
		super(name);
	}

	public void greet() {
		System.out.println("Hello! I am " + name);
		System.out.println("I am a student.");
	}
}