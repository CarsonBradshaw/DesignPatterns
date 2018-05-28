package chain_of_responsibility.request;

public class HamRequest implements Request {
    @Override
    public String getType() {
        return "ham";
    }

    @Override
    public String getBody() {
        return "Gimme some ham.";
    }
}
