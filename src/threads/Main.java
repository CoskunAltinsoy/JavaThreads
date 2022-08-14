package threads;

public class Main {

	public static void main(String[] args) {
		
//		Runnable task = () -> {
//		    String threadName = Thread.currentThread().getName();
//		    System.out.println("Hello " + threadName);
//		};
//
//		task.run();
//
//		Thread thread = new Thread(task);
//		thread.start();
//
//		System.out.println("Done!");
//
		MyRunnable runnable = new MyRunnable("Thread-1");
		runnable.start();
		
		MyRunnable runnable2 = new MyRunnable("Thread-2");
		runnable2.start();
	}
	
	
}
