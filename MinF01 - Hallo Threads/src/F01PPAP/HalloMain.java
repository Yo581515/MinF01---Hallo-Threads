package F01PPAP;

public class HalloMain {
	public static void main(String[] args) throws InterruptedException {
		// #1
//		Thread t = new MinTraad();

		// #2
//		Thread t = new Thread() {
//			@Override
//			public void run() {
//				System.out.println("Hallo fra anonym Thread");
//				System.out.println("Hallo fra anonym Thread2");
//			}
//		};

		// #3
//		Thread t = new Thread(new MinRunnable());

		// #4
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Hallo fra Runnable");
//			}
//		});

		// #5
//		Thread t = new Thread(() -> System.out.println("Hallo fra anonym Runnable"));

//		for (int i = 0; i < 10; i++) {
//			final int x = i;
//			Thread t = new Thread(() -> System.out.println("Hallo fra anonym Runnable " + x));
//			t.start();
//		}

		for (int i = 0; i < 10; i++) {
			final int x = i;
			Thread t = new Thread() {
				@Override
				public void run() {
					System.out.println("Hallo fra anonym Thread " + x);
				}
			};
			t.start();
//			t.run();

		}

		System.out.println("Hallo fra Main");
		Thread.sleep(8);
		// System.out.println("Hallo fra Main 2");

	}

}
