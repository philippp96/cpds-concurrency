public class Card {
	private String turn;

	synchronized public void set(String name) {
		if (name == "alice")
			this.turn = "bob";
		else
			this.turn = "alice";
	}

	synchronized public boolean my_turn(String name) {
		return (turn == name);
	}
}
