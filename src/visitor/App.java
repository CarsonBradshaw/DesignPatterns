package visitor;

import visitor.visitable.HomeGoods;
import visitor.visitable.Produce;
import visitor.visitable.Visitable;
import visitor.visitor.RegularTaxVisitor;
import visitor.visitor.Visitor;

public class App {
    public static void main(String[] args) {
        Visitor visitor = new RegularTaxVisitor();

        Visitable produce = new Produce("banana", 3);
        Visitable homeGoods = new HomeGoods("paper towels", 4);

        produce.visit(visitor);
        homeGoods.visit(visitor);
    }
}
