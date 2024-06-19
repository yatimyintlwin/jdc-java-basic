package application.model;

public class Course {

	String name;

	public Course(String name) {
		this.name = name;
	}

	public void showDetails() {
		System.out.println("Course name is " + name);
	}
}