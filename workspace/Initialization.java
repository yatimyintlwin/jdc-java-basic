import java.util.*;

public class Initialization {

	// Variables
	static int maxCount = 100;
	static List<String> members = new ArrayList<String>();

	public static void main(String[] args) {
		new Initialization();
		new Initialization(10);
		new Initialization();
		new Initialization(10);
		new Initialization();
		new Initialization(10);
	}

	// Methods
	void doSomething() {
		int data = 10;

		// Local Code Block
		{
			int otherData = 100;
		}

		// Some other codes
	}

	// Init Blocks
	{
		System.out.println("Instance Block is working");
	}

	static {
		members.add("A");
		members.add("B");
		System.out.println("Static Block is working");
	}

	// Constructor
	public Initialization() {
		System.out.println("Constructor is working");
	}

	public Initialization(int a) {
		System.out.println("Constructor with argument is working");
	}

	// Nested Classes
}