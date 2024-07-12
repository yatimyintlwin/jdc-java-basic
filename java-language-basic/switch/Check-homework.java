void checkEverage() {
	int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	var result = everage(array1);

	System.out.println("Result of everage is %s".formatted(result));
	System.out.println("Result is %s".formatted(result == 5 ? "Right" : "Wrong"));	
}

void checkPrimeNumber() {

	int [] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

	var totalResult = true;

	for(var i = 1; i <= 100; i ++) {
		var result = isPrimeNumber(i);
		var foundIndex = Arrays.binarySearch(primes, i);
		var isPrime = foundIndex >= 0;

		System.out.printf("%s %s is prime number and output is %s.%n", 
			i, 
			isPrime ? "is" : "is not", 
			result == isPrime ? "right" : "worng"
		);

		if(result != isPrime) {
			totalResult = false;
		}
	}

	System.out.println("Method implementation is %s.%n", totalResult ? "right" : "wrong");
}