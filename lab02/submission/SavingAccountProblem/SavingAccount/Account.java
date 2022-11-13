public class Account {

	private final int N;
	private int balance = 0;

	public Account(int N) {
		this.N = N;
	}

	public synchronized void withdraw(int amount) throws InterruptedException {
		while (amount > balance) {
			System.out.println(Thread.currentThread().getName() + " has to wait");
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

	//only for trace purposes
	public synchronized void print_balance() {
		System.out.println("balance: " + balance);
	}

	public int getN() {
		return this.N;
	}
}
