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