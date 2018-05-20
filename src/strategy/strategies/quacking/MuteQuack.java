package strategy.strategies.quacking;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Can't quack because I'm mute.");
    }
}
