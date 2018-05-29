package visitor.visitable;

import visitor.visitor.Visitor;

public class Produce implements Visitable {

    private String name;
    private int price;

    public Produce(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int getState() {
        return price;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.accept(this);
    }
}
