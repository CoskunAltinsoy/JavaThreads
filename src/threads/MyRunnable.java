package threads;

public class MyRunnable implements Runnable{

	Thread thread;
	private String threadName;
	
	public MyRunnable(String name) {
		threadName = name;
		System.out.println("Creating " +  threadName );
	}
	
	
	@Override
	public void run() {
		 System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            Thread.sleep(100);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
		
	}
	
	  public void start () {
	      System.out.println("Starting " +  threadName );
	      if (thread == null) {
	    	 thread = new Thread (this, threadName);
	    	 thread.start ();
	      }
	  }
	
}
