package chain_of_responsibility.request;

public class TurkeyRequest implements Request {
    @Override
    public String getType() {
        return "turkey";
    }

    @Override
    public String getBody() {
        return "Gimme some turkey.";
    }
}
