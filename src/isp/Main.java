package isp;

public class Main {

	public static void main(String[] args) {
		GmailAccount gmail = new GmailAccount("test", "test@gmail.com");
		EmailSender.sendEmail(gmail, "mezu bat");
	}
}
