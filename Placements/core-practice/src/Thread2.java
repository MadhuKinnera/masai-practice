
public class Thread2 implements Runnable{
	
	ThreadExample tExample2;
	
	public Thread2(ThreadExample tExample) {
		this.tExample2 = tExample;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		tExample2.threadMethod();
		
	}

}
