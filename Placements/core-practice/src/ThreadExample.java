
public class ThreadExample {
	
	
	public  synchronized void staticThreadMethod() {
		System.out.println("inside staticThread1 of thread example class");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("static method ended");
	}

	public synchronized void threadMethod() {
		System.out.println("inside threadMethod2 of example class ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("normal method ended");
	}
	
}
