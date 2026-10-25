package ocp;

public class GoogleAuth implements AuthServiceInterface {
    @Override
    public boolean authenticate(String log, String pass) {
        // use the google api
        return true;
    }
}