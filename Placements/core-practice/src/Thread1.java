
public class Thread1 implements Runnable{
	
	ThreadExample tExample1;
	
	public Thread1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Thread1(ThreadExample tExample) {
		this.tExample1=tExample;
	}

	@Override
	public void run() {
		tExample1.staticThreadMethod();
	}

}
