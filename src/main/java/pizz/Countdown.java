package pizz;

public class Countdown extends Thread {
	@Override
	public void run() {
		System.out.println("Avvio in");
		try {
			for (int i = 3; i > 0; i--) {
				System.out.print(i + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println("Countdown interrotto");
		}
	}
}