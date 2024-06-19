package access.service;

import access.model.security.Account;

public class AccountService {

	public void showAccount(Account account) {
		System.out.println(account.name);
		System.out.println(account.loginId);
		System.out.println(account.password);
	}
}