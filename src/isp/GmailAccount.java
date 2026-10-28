package isp;

public class GmailAccount implements Emailable {
	 String name, emailAddress;
	 
	 public GmailAccount(String n, String e)
	 {
		 name = n;
		 emailAddress = e;
	 }
	 public String getEmail() { return emailAddress; }
}
