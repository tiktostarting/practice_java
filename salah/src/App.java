
public class App {
	public static void main(String[] args) {
		MailService mailService = new MailServiceImpl();
		
		UserView uv = new UserView(mailService);
//		uv.setMailService(mailService);
		uv.setMailService(mailService);
		uv.show();
	}
}
