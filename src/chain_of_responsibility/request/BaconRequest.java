package chain_of_responsibility.request;

public class BaconRequest implements Request {
    @Override
    public String getType() {
        return "bacon";
    }

    @Override
    public String getBody() {
        return "Gimme some bacon!";
    }
}
