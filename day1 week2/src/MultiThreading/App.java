package MultiThreading;

import java.util.stream.IntStream;

public class App {
	
	private static int total;
	
	public static void main(String[] args) {
		IntStream.range(1, 1001).forEach(val -> {
			App app = new App();
			new SendMail(val, app::result).start();
		});
	}
	
	public synchronized void result() {
		total++;
		if(total == 1000) {
			System.out.println(total);
		}
	}
}
