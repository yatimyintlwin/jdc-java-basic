// Home work
int everage(int ... array) {

	var sum = 0;

	for(var element : array) {
		sum += element;
	}

	return sum / array.length;
}

boolean isPrimeNumber(int value) {
	if(value == 1) {
		return false;
	}

	for(var i = 2; i < value /2; i ++) {
		if(value % i == 0) {
			return false;
		}
	}
	return true;
}