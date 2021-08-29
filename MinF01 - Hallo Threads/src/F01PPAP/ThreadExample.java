package F01PPAP;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
//		 Thread thread = new Thread("New Thread") {
//		      public void run(){
//		        System.out.println("run by: " + getName());
//		      }
//		   };
//		   thread.start();
//		   System.out.println(thread.getName());
		   
		   
//		   Runnable runnable = new MyRunnable();
//		   Thread thread = new Thread(runnable, "New Thread");
//		   thread.start();
//		   System.out.println(thread.getName());
		
		
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
		}
		
		
		
		
	}
}