package adapter;

public class Turkey implements AdapteeTurkeyInterface {
    @Override
    public void gobble() {
        System.out.println("Gobble, gobble.");
    }

    @Override
    public void attemptToFly() {
        System.out.println("I believe I can fly!");
    }
}
