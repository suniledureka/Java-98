package co.edureka.threads;

class MyTask2 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() = " + t.getName().toUpperCase());
		System.out.println(t);		
	}	
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println("thread in main() = " + t.getName().toUpperCase());
		System.out.println(t);
		
		Thread ct = new MyTask2();		
		ct.start();
		
		System.out.println("no of threads = " + Thread.activeCount());
	}
}

