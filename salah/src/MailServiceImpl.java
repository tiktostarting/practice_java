
public class MailServiceImpl implements MailService{

	public void send(String to, String body) {
		System.out.println(" to => " + to );
		System.out.println(" body => " + body );
	}
}
