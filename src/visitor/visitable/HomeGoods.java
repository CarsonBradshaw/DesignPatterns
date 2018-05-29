package visitor.visitable;

import visitor.visitor.Visitor;

public class HomeGoods implements Visitable {

    private String name;
    private int price;

    public HomeGoods(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.accept(this);
    }

    @Override
    public int getState() {
        return price;
    }
}
