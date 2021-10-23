package MultiThreading;

public class SendMail extends Thread{

	private int mail;
	private OnDoneListener listener;
	
	public SendMail(int mail, OnDoneListener listener) {
		this.mail = mail;
		this.listener = listener;
	}
	
	@Override
	public void run() {
		send(mail);
	}
	
	public void send(int mail) {
		
	}
}
