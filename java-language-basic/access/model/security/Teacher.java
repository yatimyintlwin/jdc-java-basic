package access.model.security;

public class Teacher extends Account {

	public void showName() {
		System.out.println(name);
	}

	public void showLoginId() {
		System.out.println(loginId);
	}

	public void showPassword() {
		System.out.println(password);
	}
}