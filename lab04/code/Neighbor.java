public class Neighbor extends Thread {
	private Flags flags;
	private Card card;

	public Neighbor(Flags flags, Card card) {
		this.flags = flags;
		this.card = card;
	}

	/*
	public void run() {
		while (true) {
			try {
				String name = Thread.currentThread().getName();

				System.out.println("try again, my name is: "+ name);
				Thread.sleep((int)(200*Math.random()));

				flags.set_true(name);
				card.set(name);

				while (flags.query_flag(name) && !card.my_turn(name)) {
					System.out.println(name + " waits");
					Thread.sleep(400);
				}

				System.out.println(name + " enters");
				Thread.sleep(400);
				System.out.println(name + " exits");

				flags.set_false(name);
			}
			catch (InterruptedException e) {};
		}
	}
	*/

	/* version of the run-method that simulates stress:
	 */
	
	public void run() {
		while (true) {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("try again, my name is: "+ name);

				flags.set_true(name);
				card.set(name);

				//To model greedy write the sleep as follows
				Thread.sleep((int)(200*Math.random()));

				while (flags.query_flag(name) && !card.my_turn(name)) {
					System.out.println(name + " waits");
					Thread.sleep(400);
				}
				System.out.println(name + " enters");
				Thread.sleep(400);
				System.out.println(name + " exits");

				flags.set_false(name);
			}
			catch (InterruptedException e) {};
		}
	}
}
