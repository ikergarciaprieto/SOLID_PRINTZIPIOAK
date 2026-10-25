package ocp;

public class FacebookAuth implements AuthServiceInterface {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the FB api
        return true;
    }
}
