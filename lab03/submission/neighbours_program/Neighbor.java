public class Neighbor extends Thread {
	private Flags flags;
	public Neighbor(Flags flags) {
		this.flags = flags;
	}
	public void run() {
		while (true) {
			try {
				String name = ... ;
				System.out.println("try again, my name is: "+ name);
				Thread.sleep((int)(200*Math.random()));
				flags. ...;
				if ( ... ) {
					System.out.println(name + " enter");
					Thread.sleep(400);
					System.out.println(name + " exits");
				}
				Thread.sleep((int)(200*Math.random()));
				flags ... ;
			}
			catch (InterruptedException e) {};
		}
	}

	/* version of the run-method that simulates stress:
	
	public void run() {
		while (true) {
			try {
				String name = ...;
				System.out.println("try again, my name is: "+ name);
				flags. ...;
				//To model greedy write the sleep as follows
				Thread.sleep((int)(200*Math.random()));
				if (...) {
					...
				}
				Thread.sleep((int)(200*Math.random()));
				flags. ...;
			}
			catch (InterruptedException e) {};
		}
	}
	 */
}

}