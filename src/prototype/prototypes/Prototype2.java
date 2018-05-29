package prototype.prototypes;

public class Prototype2 implements Cloneable {

    @Override
    public Prototype2 clone() throws CloneNotSupportedException {
        return (Prototype2) super.clone();
    }
}
