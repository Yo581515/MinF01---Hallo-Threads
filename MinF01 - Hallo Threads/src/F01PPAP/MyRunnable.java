package F01PPAP;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("run by: " + Thread.currentThread().getName());

	}

}
