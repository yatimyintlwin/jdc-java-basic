record Data(int value, String name) implements Comparable<Data>{
	public int compareTo(Data other) {
		return value - other.value();
	}
}

var array = new Data[] {
	new Data (7, "Seven"),
	new Data (6, "Six"),
	new Data (3, "Three"),
	new Data (5, "Five"),
	new Data (2, "Two"),
	new Data (1, "One"),
}

Comparator<Data> desendingByValue = (a, b) -> b.value() - a.value();
Comparator<Data> ascendingByName = (a, b) -> a.name().compareTo(b.name());