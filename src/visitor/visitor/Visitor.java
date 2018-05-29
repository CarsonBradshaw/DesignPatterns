package visitor.visitor;

import visitor.visitable.Visitable;

public interface Visitor {
    void accept(Visitable visitable);
}
