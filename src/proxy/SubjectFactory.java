package proxy;

import proxy.virtual.ExpensiveToCreateClassProxy;
import proxy.virtual.Subject;

public class SubjectFactory {
    public static Subject getSubject(){
        return new ExpensiveToCreateClassProxy();
    }
}
