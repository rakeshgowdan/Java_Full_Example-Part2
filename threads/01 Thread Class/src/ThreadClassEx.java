
public class ThreadClassEx extends Thread{
	
	public void run() {
		System.out.println("thread Started:: ThreadClass");
	}

}

class Driver{
	public static void main(String[] args) {
	
		ThreadClassEx obj=new ThreadClassEx();
		obj.start();
	}
}