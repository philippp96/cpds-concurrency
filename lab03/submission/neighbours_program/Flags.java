public class Flags {
	private boolean flag_alice;
	private boolean flag_bob;
	public Flags() {
		flag_alice = false;
		...
	}
	public synchronized boolean query_flag(String s) {
		//no condition synchronization is needed
		if (s.equals("alice")) return flag_bob;
		return ... ;
	}
	public synchronized void set_true(String s) {
		//no condition synchronization is needed
		if (s.equals("alice")) { flag_alice = true;}
		else { flag_bob = true; }
	}
	public synchronized void set_false(String s) {
		//no condition synchronization is needed
		if (s.equals("alice")) { ... }
		else { ... }
	}
}
