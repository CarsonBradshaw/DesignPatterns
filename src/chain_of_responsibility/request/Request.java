package chain_of_responsibility.request;

public interface Request {
    String getType();
    String getBody();
}
