int sumOddIndexValue(int [] array) {

	var total = 0;

	for (var i = 0; i < array.length; i++) {

		var element = array[i];

		if(i % 2 == 0) {
			System.out.println("Skip index %d and value %d".formatted(i, element));
			continue;
		}

		total += element;
	}

	return total;
}

int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};