package visitor.visitor;

import visitor.visitable.Visitable;

public class RegularTaxVisitor implements Visitor {
    public static final float TAX_RATE = .07f;

    @Override
    public void accept(Visitable visitable) {
        outputTaxes(visitable.getState());
    }

    private void outputTaxes(int state) {
        System.out.println(state * TAX_RATE);
    }
}
