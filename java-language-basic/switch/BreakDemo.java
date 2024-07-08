int sumWithLimit(int [] array, int limit) {

	var total = 0;

	for(var i = 0; i < array.length; i ++) {

		if(i >= limit) {
			break;
		}

		var element = array[i];
		total += element;
	}

	return total;
}

int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};