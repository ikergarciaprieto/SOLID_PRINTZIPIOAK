package ocp;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
	private Map<String, AuthServiceInterface> providers;

    public AuthService() {
        providers = new HashMap<>();
        providers.put("facebook", new FacebookAuth());
        providers.put("google", new GoogleAuth());
        providers.put("twitter", new TwitterAuth());
        providers.put("apple", new AppleAuth()); // Apple zerbitzu berria gehituta.
    }
    
	public boolean signIn(String service, String log, String pass) {
        AuthServiceInterface provider = providers.get(service.toLowerCase());
        if (provider != null) {
            return provider.authenticate(log, pass);
        }
        return false;
    }
		

}


