package ocp;

public class AppleAuth implements AuthServiceInterface {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the Apple api
        return true;
    }
}

