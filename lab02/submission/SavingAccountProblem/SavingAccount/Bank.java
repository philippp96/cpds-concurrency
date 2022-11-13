public class Bank extends User {

	public Bank(Account acc) {
		super(acc);
	}

	protected String getNextAction() {
		return "deposit";
	}

}
