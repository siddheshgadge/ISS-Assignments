class Writing implements Runnable {
	public void run() {
		System.out.println("Writing Work started!");
		for(int i = 1; i<=11; i++) {
			System.out.println("Writing assignment no --> " + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Issue" + e);
			}
		}
		System.out.println("Writing Work ended!");
	}
}

class Listening extends Thread {
	public void run() {
		System.out.println("Songs started!");
		for(int i = 1; i<=20; i++) {
			System.out.println("Song no --> " + i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println("Issue" + e);
			}
		}	
		System.out.println("Songs ended!");
	}
}

class RunnableTest {
	public static void main(String args[]) {
		System.out.println("Work Started!");
		Writing w = new Writing();
		Thread t1 = new Thread(w);
		t1.start();
		Listening l = new Listening();
		Thread t2 = new Thread(l);
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			System.out.println("Issue --> " + e);
		}
		System.out.println("Work Ended!");
	}
}