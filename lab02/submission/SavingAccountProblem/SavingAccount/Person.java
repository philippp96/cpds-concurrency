import java.util.concurrent.ThreadLocalRandom;

public class Person extends User {

	public Person(Account acc) {
		super(acc);
	}

	protected String getNextAction() {
		if (ThreadLocalRandom.current().nextInt(0, 101) > 30) {
			return "withdraw";
		} else {
			return "deposit";
		}
	}

}
