class Data {

	private int value;

	public Data(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public string toString() {
		return "Data(%s)".formatted(value);
	}
}