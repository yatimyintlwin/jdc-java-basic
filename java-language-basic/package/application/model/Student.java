package application.model;

public class Student {

	String name;

	public Student(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello I am " + name);
	}
}
