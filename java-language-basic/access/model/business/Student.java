package access.model.business;

import access.model.security.Account;

public class Student extends Account {

	public void showName() {
		System.out.println(name);
	}

	public void showLoginId() {
		System.out.println(loginId);
	}
}