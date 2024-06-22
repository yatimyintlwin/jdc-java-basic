void demo(int value) {

	switch(value) {
	case 1, 2 ->
		System.out.println("This is One or Two");
	case 3 ->
		System.out.println("This is Three");
	case 4 ->
		System.out.println("This is Four");
	default ->
		System.out.println("Others");
	}
}