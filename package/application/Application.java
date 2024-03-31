/*
 * This package is base package for Application
 */
package application;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello Java From Package");

		// Fully Qualified Name
		var student = new application.model.Student("Aung Aung");
		student.greet();
	}

}