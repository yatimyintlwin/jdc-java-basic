package access.model.security;

public class SamePackage {

	public void show(Account a) {
		System.out.println(a.name);
		System.out.println(a.loginId);
		System.out.println(a.password);
	}
}