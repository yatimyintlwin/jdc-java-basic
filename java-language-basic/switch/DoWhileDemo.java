import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileDemo {

	private Scanner scanner;
	private ThreadLocalRandom random;

	public DoWhileDemo() {
		scanner = new Scanner(System.in);
		random = ThreadLocalRandom.current();
	}

	public static void main(String[] args) {
		new DoWhileDemo().launch();
	}

	void launch() {

		// show welcome message
		showMessage("Guess Number from 1 to 3");

		do {
			// get user input
			System.out.print("Enter Your Number from 1 to 3 : ");
			String input = scanner.nextLine();
			int userSelected = Integer.parseInt(input);
			System.out.println();

			// generate random number
			int systemSelected = random.nextInt(1, 4);

			System.out.println("You select %d.".formatted(userSelected));
			System.out.println("System select %d.".formatted(systemSelected));

			// check result & show result
			if(userSelected == systemSelected) {
				System.out.println("You win!");
			} else {
				System.out.println("You loose!");
			}

			System.out.println();

		// ask user to contnue game
		} while(askUserToContinue());

		showMessage("See you again!");

	}

	private void showMessage(String message) {
		System.out.println("=========================");
		System.out.println(message);
		System.out.println("=========================");
		System.out.println();
	}

	private boolean askUserToContinue() {
		System.out.print("Do you want to continue? (y or Y) / others : ");
		var answer = scanner.nextLine();
		System.out.println();
		return "Y".equalsIgnoreCase(answer);
	}
}