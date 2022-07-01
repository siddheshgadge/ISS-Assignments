class Writing extends Thread {
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

class ThreadTest {
	public static void main(String args[]) {
		System.out.println("Work Started!");
		Writing w = new Writing();
		w.start();
		Listening l = new Listening();
		l.start();
		try {
			w.join();
			l.join();
		} catch(InterruptedException e) {
			System.out.println("Issue --> " + e);
		}
		System.out.println("Work Ended!");
	}
}