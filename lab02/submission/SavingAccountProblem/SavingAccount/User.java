import java.util.concurrent.ThreadLocalRandom;

public abstract class User extends Thread {
	private Account acc;

	public User(Account acc) {
		this.acc = acc;
	}

	public void run() {
		while (true) {
			int amount = getNextAmount();
			try {
				Thread.sleep(500);
				if (this.getNextAction() == "withdraw") {
					acc.withdraw(amount);
				} else {
					acc.deposit(amount);
				}
			} catch(InterruptedException e) {

			}
		}
	}

	protected abstract String getNextAction();

	private int getNextAmount() {
		return ThreadLocalRandom.current().nextInt(0, acc.getN() + 1);
	}
}
