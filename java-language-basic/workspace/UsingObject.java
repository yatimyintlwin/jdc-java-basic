public class UsingObject {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Aung Aung";
		p1.age = 28;

		Person p2 = new Person();
		p2.name = "Thidar";
		p2.age = 20;

		p1.greet();
		p2.greet();
	}
}