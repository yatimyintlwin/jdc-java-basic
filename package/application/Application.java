/*
 * This package is base package for Application
 */
package application;

// import application.model.Student;

import static application.model.sub.Subject.*;

import application.model.*;


public class Application {

	public static void main(String[] args) {
		System.out.println("Hello Java From Package");

		// Fully Qualified Name
		var student = new application.model.Student("Aung Aung");
		student.greet();

		var student2 = new application.model.Student("Thidar");
		student2.greet();

		var course = new Course("Java Basic");
		course.showDetails();

		display();
	}

}