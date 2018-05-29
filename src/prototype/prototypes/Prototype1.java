package prototype.prototypes;

public class Prototype1 implements Cloneable {

    @Override
    public Prototype1 clone() throws CloneNotSupportedException {
        return (Prototype1) super.clone();
    }
}
