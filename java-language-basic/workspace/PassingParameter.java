public class PassingParameter {

	public static void main(String[] args) {
		Data data = new Data(10);

		increment(data);

		System.out.println("Result is " + data.value);
	}

	static void increment(Data data) {
		System.out.println("Input is " + data.value);
		data.value ++;
		System.out.println("After increment is " + data.value);
	}
}

class Data {
	int value;

	Data(int value) {
		this.value = value;
	}
}