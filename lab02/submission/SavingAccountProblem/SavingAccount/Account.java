public class Account {

	// known as N in our LST
	private final int transactionLimit;
	private int balance = 0;

	public Account(int N) {
		this.transactionLimit = N;
	}

	public synchronized void withdraw(int amount) throws InterruptedException {
		while (amount > balance) {
			System.out.println(Thread.currentThread().getName() + " has to wait to withdraw, insufficient funds");
			wait();
		}
		System.out.println(Thread.currentThread().getName()+ " withdraws " + amount);
		balance -= amount;
		print_balance();
	}

	public synchronized void deposit(int amount) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " deposits "+ amount);
		balance += amount;
		notifyAll();
		print_balance();
	}

	public synchronized void print_balance() {
		System.out.println("balance: " + balance);
	}

	public int getTransactionLimit() {
		return this.transactionLimit;
	}
}
