import java.util.Scanner;

public class UserView {

	private MailService mailService;
	
	public UserView(MailService mailService) {
		this.mailService = mailService;
	}
	
	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}
	
	void show() {
		Scanner scan = new Scanner(System.in);
		System.out.print("to : ");
		String to = scan.nextLine();
		System.out.print("body : ");
		String body = scan.nextLine();
	}
}
