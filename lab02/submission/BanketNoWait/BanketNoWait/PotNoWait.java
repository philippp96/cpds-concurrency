public class PotNoWait {

	private int servings = 0;
	private int capacity;

	public PotNoWait(int capacity) {
		this.capacity = capacity;
	}

	public synchronized void getserving() throws InterruptedException {
		if (servings == 0) {
			System.out.println(Thread.currentThread().getName() + " go walk");
		} else {
			Thread.sleep(200);
			--servings;
			System.out.println(Thread.currentThread().getName()+ " is served");
			print_servings();
		}
	}

	public synchronized void fillpot() throws InterruptedException {
		//Condition synchronization: no servings in the pot
		// otherwise, go to the Waiting Set til the pot is empty
		if (servings > 0) {
			System.out.println(Thread.currentThread().getName() + " go walk");
		} else {
			System.out.println("cook fills the pot");
			servings = capacity;
			// wake up threads in Waiting Set in order to asure that the next savage will run
			print_servings();
		}
	}

	//only for trace purposes
	public synchronized void print_servings() {
		System.out.println("servings in the pot: " + servings);
	}
}
