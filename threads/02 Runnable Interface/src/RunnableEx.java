
public class RunnableEx  implements Runnable {

	@Override
	public void run() {
		System.out.println("thread Started:: Runnable");
		
	}

}

class Driver{
	public static void main(String[] args) {
		RunnableEx obj =new RunnableEx();
		Thread t=new Thread(obj);
		t.start();
	}
}