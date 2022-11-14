public class BanketNoWait {

	public static void main(String[] args) {
		// Initilize objects
		PotNoWait pot = new PotNoWait(5);

		Thread s1 = new Savage(pot); s1.setName("alice");
		Thread s2 = new Savage(pot); s2.setName("bob");
		Thread s3= new Savage(pot); s3.setName("peter");
		Thread s4= new Savage(pot); s4.setName("xana");

		Thread c = new Cook(pot); c.setName("cook");

		//Start threads
		s1.start(); s2.start(); s3.start(); s4.start();

		c.start();
	}

}
