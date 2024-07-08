void showSum(int ... array) {

	System.out.println("Start Method");

	if(array.length == 0) {
		System.out.println("Array length is 0.");
		System.out.println("Total is 0.");
		return;
	}

	System.out.println("Array Length is grater than 0.");

	var total = 0;

	for(var element : array) {
		total += element;
	}

	System.out.println("Total is %d".formatted(total));
}