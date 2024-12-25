package StringQuestionPackages;

public class Mythread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread is running =" + i);
		}
	}

	public static void main(String[] args) {
		Mythread mt = new Mythread();
		Thread t = new Thread(mt);
		t.start();
	}

}
