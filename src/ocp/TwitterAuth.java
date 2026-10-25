package ocp;

public class TwitterAuth implements AuthServiceInterface {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the Twitter api
        return true;
    }
}
