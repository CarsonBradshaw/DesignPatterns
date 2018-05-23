package adapter;

public class TurkeyToDuckAdapter implements ClientDuckInterface {

    private AdapteeTurkeyInterface turkey;

    public TurkeyToDuckAdapter(AdapteeTurkeyInterface turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.attemptToFly();
    }
}
