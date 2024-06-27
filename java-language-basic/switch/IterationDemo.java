// [1, 2, 3]
int sum(int ... array) {

	var result = 0;
	var counter = 0;

	while(counter < array.length) {
		result += array[counter];
		counter ++;
	}

	return result;
}

int sumWithFor(int ... array) {

	var result = 0;

	for(var i = array.length - 1; i >= 0; i--) {
		System.out.println("Counter is %d".formatted(i));
		System.out.println("Element is %d".formatted(array[i]));
		result += array[i];
		System.out.println("Result is %d".formatted(result));
	}

	return result;
}

int sumWithEach(int ... array) {
	var result = 0;

	for(var element : array) {
		result += element;
	}

	return result;
}