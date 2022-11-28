public class Field {
	public static void main(String args[]) {
		Card card = new Card();
		Flags flags = new Flags();
		Thread a = new Neighbor(flags, card);
		a.setName("alice");
		Thread b = new Neighbor(flags, card);
		b.setName("bob");
		a.start();
		b.start();
	}
}
