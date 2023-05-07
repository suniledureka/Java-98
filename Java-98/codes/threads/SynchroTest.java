package co.edureka.threads;

class Printer {
	//public void printTable(int num) {
	public synchronized void printTable(int num) {
		for(int i=1; i<=9; i++) {
			int p = num * i;
			System.out.println(num + " x " + i + " = " + p);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		System.out.println("----------------------------------------------------------------");
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {}		
	}
}

class ComputerThread1 extends Thread{
	Printer printer;
	int doc;
	ComputerThread1(Printer p, int doc){
		this.printer = p;
		this.doc = doc;
	}
	
	public void run() {
		printer.printTable(doc);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;
	int doc;
	ComputerThread2(Printer p, int doc){
		this.printer = p;
		this.doc = doc;
	}
	
	public void run() {
		printer.printTable(doc);
	}
}
public class SynchroTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		ComputerThread1 t1 = new ComputerThread1(printer, 5);
		ComputerThread2 t2 = new ComputerThread2(printer, 6);
		
		t1.start();
		t2.start();
	}
}