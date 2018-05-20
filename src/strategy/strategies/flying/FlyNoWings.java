package strategy.strategies.flying;

public class FlyNoWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly without wings.");
    }
}
