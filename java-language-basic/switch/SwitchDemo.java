enum Days {
	MON, TUE, WED, THU, FRI, SAT, SUN
}

String getDayType(Days day) {
	return switch (day) {
	case MON, TUE, WED, THU, FRI -> result = "Week Day";
	default -> "Week End";
	};
}

void demo(Days day) {

	switch(day) {
	case MON, TUE, WED, THU, FRI -> {
		System.out.println("Week Day");
	default:
		System.out.println("Week End");
		break;		
	}

	}

}