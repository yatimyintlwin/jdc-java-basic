public class MethodDemo {

	int getLength(String str) {

		if (null == str) {
			return 0;
		}

		// The last statement of the block
		return str.length();
	}
}