boolean isEven(int value) {
	return value % 2 == 0;
}

void showGrade(int mark) {

	if(mark >= 0 && mark < 40) {
		System.out.println("Fails");
	} else if (mark >= 40 && mark < 80) {
		System.out.println("Pass");
	} elase if (mark >= 80 && mark < 100) {
		System.out.println("Excellent");
	} else if (mark == 100) {
		System.out.println("Perfect");
	} else {
		System.out.println("Impossible");
	}
}