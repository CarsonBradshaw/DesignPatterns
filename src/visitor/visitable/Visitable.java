package visitor.visitable;

import visitor.visitor.Visitor;

public interface Visitable {
    void visit(Visitor visitor);
    int getState();
}
