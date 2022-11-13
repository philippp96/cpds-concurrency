public class SavingsAccount {

	public static void main(String[] args) {
		Account account = new Account(10);
		Person a = new Person(account);
		a.setName("alice");
		Person b = new Person(account);
		b.setName("bob");
		Bank bank = new Bank(account);
		bank.setName("bank");
		a.start();
		b.start();
		bank.start();
	}
}
