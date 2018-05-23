package adapter;

public class App {
    public static void main(String[] args) {
        ClientDuckInterface clientObject = new TurkeyToDuckAdapter(new Turkey());
        clientObject.fly();
        clientObject.quack();
    }
}
